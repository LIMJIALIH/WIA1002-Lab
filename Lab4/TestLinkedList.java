package Lab4;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList <Character> linkedList = new MyLinkedList<>();
        
        linkedList.add('a');
        linkedList.add('b');
        linkedList.add('c');
        linkedList.add('d');
        linkedList.add('e');
        
        linkedList.print();
        
        linkedList.reverse();

        System.out.print("\nNumber of elemenets in the list: " + linkedList.getSize());
        
        System.out.print("\nFirst element: " + linkedList.getFirst() + "\nLast element: " + linkedList.getLast());
        
//        linkedList.remove(middle);
        System.out.print("\n");
        linkedList.print();
        
        System.out.print("\nIndex of second value : " + linkedList.indexOf('b') + "\nIndex of third value : " + linkedList.indexOf('d'));
        
        System.out.print("\nExist of 'c' : " + linkedList.contains('c'));
        
        System.out.print("\n");
        
        linkedList.set(0, 'h');
        linkedList.set(1, 'e');
        linkedList.set(2, 'l');
        linkedList.set(3, 'l');
        linkedList.set(4, 'o');
        
        linkedList.print();
        
        System.out.print("\nMiddle Value: " + linkedList.getMiddleValue());
    }
}
