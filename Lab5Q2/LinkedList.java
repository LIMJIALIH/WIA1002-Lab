package Lab5Q2;

public class LinkedList <E> {
    private int size = 0;
    private Node head;
    private Node tail;
    
    public LinkedList(){
        size = 0;
        head = null;
        tail = null;
    }
    
    public void add(E e){
        Node <E> newNode = new Node<>(e);
        if(size == 0){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public void removeElement(E e){
        if(size == 0){
            System.out.print("\nThis element is not exist.");
            return;
        }
            
            if(head.element.equals(e)){
                head = head.next;
                size--;
                if(size == 0){
                    tail = null;
                }
                return;
            }
            
            Node <E> current = head;
            Node <E> temp = head;
            
            while(current != null && !current.element.equals(e)){
                temp = current;
                current = current.next;
            }
            
            if(current == null){
                System.out.print("\nElement not found in the list.");
                return;
            }
            
            temp.next = current.next;
            if(current == tail){
                tail = temp;
            }
            size--;
        
    }
    
    public void printList(){
        if(size == 0 ){
            System.out.print("\nThis list is currently empty.");
        }else{
            Node current = head;
            for( int i = 0 ; i < size - 1 ; i++){
                System.out.print(current.element + ", ");
                current = current.next;
            }
            System.out.print(current.element + ".");
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean contains(E e){
        if(size == 0 ){
            return false;
        }
        else{
            Node <E> current = head;
            for( int i = 0 ; i<size ; i++){
                if(current.element.equals(e)){
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }
    
    public void replace(E e, E newE){
        Node current = head;
        
        while(current != null){
            if(current.element.equals(e)){
                current.element = newE;
                return;
            }
            current = current.next;
        }
            System.out.print("\nElement not found. No replacement made.");
    }
}
