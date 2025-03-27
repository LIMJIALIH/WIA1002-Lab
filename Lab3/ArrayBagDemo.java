
package Lab3;
/*
public class ArrayBagDemo {
    public static void main(String[] args) {
        
        BagInterface <String> bag1 = new ArrayBag();
        BagInterface <String> bag2 = new ArrayBag();
        
        String [] contentOfBag1 = {"A","A","B","A","C","A"};
        String [] contentOfBag2 = {"A","B","A","C","B","C","D","another string"};
        
        System.out.print("\nbag1 :");
        testAdd(bag1, contentOfBag1);
        displayBag(bag1);
        
        System.out.println("");
        
        System.out.print("\nbag2 :");
        testAdd(bag2, contentOfBag2);
        displayBag(bag2);
        
        System.out.println("");
        
        BagInterface <String> bag3 = bag1.union(bag2);
        
        System.out.print("\nbag3, test the method union of bag1 and bag2:");
        displayBag(bag3);
        
        System.out.println("");
        
        BagInterface<String> bag4 = bag1.intersection(bag2);
        
        System.out.print("\nbag4, test the method intersection of bag1 and bag2:");
        displayBag(bag4);
        
        System.out.println("");
        
        BagInterface<String> bag5 = bag1.difference(bag2);
        
        System.out.print("\nbag5, test the method difference of bag1 and bag2:");
        displayBag(bag5);
    }
    
    private static void testAdd(BagInterface<String> aBag, String [] content){
        System.out.print("\nAdding ");
        for(int i = 0 ; i<content.length ; i++){
            if(!aBag.isFull()){
                System.out.print(content[i] + " ");
                aBag.add(content[i]);
            }
        }
    }
    
    private static void displayBag(BagInterface<String> aBag){
        Object [] contents =  aBag.toArray();
        
        System.out.print("\nThe bag contains " + aBag.getCurrentSize() + " string(s), as follows:\n");
        
        for(int i = 0 ; i < aBag.getCurrentSize() ; i++){
            System.out.print(contents[i] + " ");
        }
    }
    
}
*/