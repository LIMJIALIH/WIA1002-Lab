
package SList;

public class SList<E> {
    
    private int size = 0;
    private SNode head;
    private SNode tail;
    
    public SList(){
        size = 0;
        head = null;
        tail = null;
    }
    
    public void appendEnd(E e){
        SNode <E> newNode = new SNode<>(e);
        if(size == 0){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public E removeInitial(){
        if(size == 0){
            return null;
        }
        else{
            SNode <E> temp = head;
            head = head.next;
            size--;
            return temp.element;
        }
    }
    
    public boolean contains(E e){
        SNode <E> current = head;
        if(size == 0){
            return false;
        }
        else{
            for(int i = 0 ; i < size ; i++){
                if(current.element.equals(e)){
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }
    
    public void clear(){
        SNode <E> current = head;
        SNode <E> temp = head;
        
        for(int i = 0 ; i<size ; i++){
            temp = current;
            current = current.next;
            temp = null;
        }
        size = 0;
        System.out.print("\nThe list has been cleared and now it is empty.");
    }
    
    public void display(){
        if(size == 0){
            System.out.print("\nThe list is currently empty and nothing to display.");
        }else{
        SNode <E> current = head;
        for(int i = 0 ; i<size ; i++){
            System.out.print(current.element + " ");
            current = current.next;
            }
        }
    }
}
