
package Lab3;
import java.util.Random;

public class ArrayBag <T> implements BagInterface <T> {

    Random rand = new Random();
    
    private T [] bag;
    private int DEFAULT_CAPACITY = 25;
    private int numberOfEntries = 0;
    
    public ArrayBag(){
        bag = (T[]) new Object [DEFAULT_CAPACITY];
    }
    
    public ArrayBag(int capacity){
        bag = (T[]) new Object [capacity];
    }
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == bag.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (isFull() == false){
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public T remove() {
        if(numberOfEntries == 0){
            return null;
        }else{
            int randPosition = rand.nextInt(numberOfEntries);
            T removed = bag[randPosition];
            T [] tempBag = (T[]) new Object [numberOfEntries-1];
            int counter = 0;
            for(int i = 0 ; i<numberOfEntries ; i++){
                if (i == randPosition){
                    continue;
                }
                tempBag [counter] = bag[i];
                counter++;
            }
            numberOfEntries--;
            bag = tempBag;
            return removed;
        }
    }

    @Override
    public boolean remove(T anEntry) {
        if(numberOfEntries == 0){
            return false;
        }
        else{
            for(int i = 0 ; i<numberOfEntries ; i++){
                if (anEntry.equals(bag[i])){
                    bag[i] = bag[numberOfEntries-1];
                    bag[numberOfEntries-1] = null;
                    numberOfEntries--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0 ; i < numberOfEntries ; i++){
            bag [i] = null;
        }
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        
        for(int i = 0 ; i <  numberOfEntries ; i++){
            if(anEntry.equals(bag[i])){
                frequency++;
            }
        }
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean contain = false;
        
        for(int i = 0 ; i<numberOfEntries ; i++){
            if(anEntry.equals(bag[i])){
                contain = true;
            }
        }
        return contain;
    }

    @Override
    public T[] toArray() {
        return bag;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag) {
        BagInterface<T> newBag = new ArrayBag <> (this.getCurrentSize() + anotherBag.getCurrentSize());
        
        T [] bag1 = this.toArray();
        T [] bag2 = anotherBag.toArray();
        
        for(int i = 0 ; i<this.getCurrentSize() ; i++){
//            System.out.print(" " + bag);
            newBag.add(bag1[i]);
        }
        
        for(int i = 0 ; i<anotherBag.getCurrentSize();i++){
//            System.out.print(" " + bag);
            newBag.add(bag2[i]);
        }

        
        return newBag;
        
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag) {
        
        T [] bag1 = this.toArray();
        T [] bag2 = anotherBag.toArray();
        int intercept = 0;
        
        for(int i = 0 ; i<this.getCurrentSize() ; i++){
            for(int j = 0 ; j<anotherBag.getCurrentSize() ; j++){
                if(bag1[i].equals(bag2[j])){
                    intercept++;
                    break;
                }
            }
        }
        
        BagInterface<T> newBag = new ArrayBag <>(intercept);
        
        boolean [] used = new boolean [anotherBag.getCurrentSize()];
        
        for(int i = 0 ; i<this.getCurrentSize() ; i++){
            for(int j = 0 ; j<anotherBag.getCurrentSize() ; j++){
                if(bag1[i].equals(bag2[j]) && !used[j]){
                    newBag.add(bag1[i]);
                    used[j] = true;
                    break;
                }
            }
        }
        return newBag;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> anotherBag) {
        
        BagInterface <T> newBag = new ArrayBag<>(this.getCurrentSize());
        
        T [] bag1 = this.toArray();
        T [] bag2 = anotherBag.toArray();
        
        boolean [] used = new boolean [anotherBag.getCurrentSize()];
        
        for(int i = 0 ; i<this.getCurrentSize();i++){
            boolean found = false;
            for(int j = 0 ; j<anotherBag.getCurrentSize(); j++){
                if(!used[j] && bag1[i].equals(bag2[j])){
                    used[j] = true;
                    found = true;
                    break;
                }
            }
            if(found == false){
                newBag.add(bag1[i]);
            }
        }
        return newBag;
    }

    
}
