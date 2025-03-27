
package Lab5Q3;

public class Node <E>{
    
    Node <E> prev;
    Node <E> next;
    E element;
    
    public Node(E element, Node next, Node prev){
        this.prev = prev;
        this.next = next;
        this.element = element;
    }
    
    public Node(E element){
        this(element,null,null);
    }
    
}
