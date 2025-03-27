
package Lab2;

import java.util.ArrayList;
import java.util.Collections;

//    private int first, second;
//    
//    public Q1(int first, int second){
//        this.first = first;
//        this.second = second;
//    }
//
//    public int getFirst() {
//        return first;
//    }
//
//    public int getSecond() {
//        return second;
//    }
//    
//    public void setPair(int first, int second){
//        this.first = first;
//        this.second = second;
//    }
//    
//    @Override
//    public String toString(){
//        return "first = " + first + " second = " + second;

class StorePair <E extends Comparable<E>> implements Comparable<StorePair<E>>{
    
    
    private E first, second;
    
    public StorePair(E first, E second){
        this.first = first;
        this.second = second;
    }
    
    public E getFirst(){
        return first;
    }
    
    public E getSecond(){
        return second;
    }
    
    public void setPair(E first, E second){
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString(){
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
//            return (first == null ? other.first == null : first.equals(other.first));
        }
        StorePair<E> other = (StorePair<E>)obj;
        return first == other.getFirst();
    }

    @Override
    public int compareTo(StorePair<E> other) {
            return this.first.compareTo(other.first);
    }
}
    
public class Q1{
    public static void main(String[] args) {
        
        StorePair<Integer> a = new StorePair(6,4);
        StorePair<Integer> b = new StorePair(2,2);
        StorePair<Integer> c = new StorePair(6,3);
        
        ArrayList <StorePair<Integer>> lists = new ArrayList<>();
        
        lists.add(a);
        lists.add(b);
        lists.add(c);
        
        System.out.print("\n" + a.equals(b));
        System.out.print("\n" + a.equals(c));
        System.out.print("\n" + b.equals(c));
        
        System.out.print("\nBefore sorting:");
        for(StorePair<Integer> list : lists){
            System.out.print("\n" + list);
        }
        
        Collections.sort(lists);
        
        System.out.print("\nAfter sorting:");
        
        for(StorePair<Integer> list : lists){
            System.out.print("\n" + list);
        }
        
    }
}
