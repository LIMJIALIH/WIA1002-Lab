package Lab4;

public class MyLinkedList <E> {
    
    private int size;
    private Node head;
    private Node tail;
    
    public MyLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }
    
    public void addFirst(E e){
        if(size == 0){
            Node <E> newNode = new Node<>(e);
            head = tail = newNode;
            size++;
        }else{
            Node <E> newNode = new Node<>(e);
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    
    public void addLast(E e){
        if(size == 0){
            Node <E> newNode = new Node<>(e);
            head = tail = newNode;
            size++;
        }
        else{
            Node <E> newNode = new Node<>(e);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    
    public void add(int index, E e){
        if (index == 0){
            addFirst(e);
        }else if(index >= size){
            addLast(e);
        }else{
            Node current = head;
            for(int i = 0 ; i< index - 1 ; i++){
                current = current.next;
            }
            Node <E> newNode = new Node<>(e);
            Node <E> temp = current.next;
            current.next = newNode;
            newNode.next = temp; 
            size++;
        }
    }
    
    public E removeFirst(){
        if ( size == 0 ){
            return null;
        }else{
            Node <E> temp = head;
            head = head.next;
            size--;
            if(head == null){ tail = null; }
            return temp.element;
        }
    }
    
    public E removeLast(){
        if( size == 0 ){
            return null;
        }
        else if ( size == 1 ){
            Node <E> temp = tail;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else{
            Node <E> current = head;
            for ( int i = 0 ; i < size - 2  ; i++){
                current = current.next;
            }
            Node <E> temp = current.next;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;            
        }
    }
    
    public E remove(int index){
        if ( index < 0 || index >= size){
            return null;
        }
        else if(index == 0){
            return removeFirst();
        }
        else if ( index == size - 1 ){
            return removeLast();
        }
        else{
            Node <E> current = head;
            for(int i = 0 ; i < index - 1 ; i++){
                current = current.next;
            }
            Node <E> temp = current.next;
            current.next = temp.next;
            size--;
            return temp.element;
        }
    }
    
    public boolean contains(E e){
        
        Node <E> current = head;
        for(int i = 0 ; i < size ; i++){
            if(current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public E get(int index){
        if(index == 0 ){
            return getFirst();
        }
        else if(index == size - 1){
            return getLast();
        }
        else{
        Node <E> current = head;
        for(int i = 0 ; i<index ; i++){
            current = current.next;
        }
        return current.element;
        }
    }
    
    public E getFirst(){
        return (E) head.element;
    }
    
    public E getLast(){
        return (E) tail.element;
    }
    
    public int indexOf(E e){
        Node <E> current = head;
        
        for( int i = 0 ; i < size ; i++){
            if(current.element.equals(e)){
                return i;
            }
            current = current.next;
        }
        return -1;
    }
    
    public int lastIndexOf(E e){
        int index = -1;
        Node <E> current = head;
        
        for(int i = 0 ; i<size ; i++){
            if(current.element.equals(e)){
                index = i;
            }
            current = current.next;
        }
        return index;
    }
    
    public E set(int index, E e){
        if(index < 0){
            index = 0;
        }
        else if(index >= size){
            index = size-1;
        }
        
        if(index == 0){
            head.element = e;
            return (E) head.element;
        }else{
            Node <E> current = head;
            for(int i = 0 ; i<index ; i++){
                current = current.next;
            }
            
            current.element = e;
            return current.element;
        }
    }
    
    public void clear(){
        head = tail = null;
        size = 0;
    }
    
    public void print(){
        if ( size == 0){
            System.out.print("\nEmpty List.");
        }else{
        Node <E> current = head;
        for(int i = 0 ; i < size-1 ; i++){
            System.out.print(current.element + " --> ");
            current = current.next;
        }
        System.out.print(current.element);
            System.out.println("");
        }
    }
    
    public void reverse(){
        
//        Node <E> prev = null;
//        Node <E> current = head;
//        Node <E> next = null;
//        
//        while(current != null){
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        
//        tail = head;
//        head = prev;
        
        MyLinkedList<E> reverse = new MyLinkedList<>();
        Node <E> current = head;
        for(int i = 0 ; i < size -1  ; i++){
            reverse.addFirst(current.element);
            current = current.next;
        }
        reverse.addFirst(current.element);
        reverse.print();
    }
    
    public void add(E e){
        Node <E> newNode = new Node<>(e);
        if ( head == null ){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public int getSize(){
        return size;
    }
    
    public E getMiddleValue(){
        if(size == 0){
            return null;
        }
        else{
            int middle = (size - 1)/2;
            Node <E> current = head;
            for(int i = 0 ; i<middle ; i++){
                current = current.next;
            }
            return current.element;
        }
    }
}
