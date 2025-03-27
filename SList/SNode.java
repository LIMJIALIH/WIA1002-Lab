
package SList;

public class SNode <E> {
    
    protected E element;
    protected SNode next;
    
    public SNode(){
        this.element = null;
        this.next = null;
    }
    
    public SNode(E element){
        this.element = element;
        this.next = null;
    }
}
