
package Lab5Q2;

public class Node <E>{
    
    protected E element;
    protected Node next;
    
    public Node(){
        this.element = null;
        this.next = null;
    }
    
    public Node(E element){
        this.element = element;
        this.next = null;
    }
}
