
package Lab4;

public class Node<T> {
    
    protected T element;
    protected Node next;
    
    public Node(){
        
    }
    
    public Node(T element){
        this.element = element;
         this.next = null;
    }
}
