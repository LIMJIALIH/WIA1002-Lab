
package Lab5Q3;

import java.util.NoSuchElementException;

public class DoublyLinkedList <E>{
    
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void addFirst(E e){
        Node <E> temp = new Node<>(e,head,null);
        if ( head != null ){
            head.prev = temp;
        }
        head = temp;
        if (tail == null){
            tail = temp;
        }
        size++;
        System.out.print("\nadding: " + temp.element);
    }
    
    public void addLast(E e){
        Node <E> temp = new Node<>(e,null,tail);
        if(tail != null){
            tail.next = temp;
        }
        tail = temp;
        if(head == null){
            head = temp;
        }
        size++;
        System.out.print("\nadding: " + temp.element);
    }
    
    public void add(int index, E e) throws IndexOutOfBoundException{
        if(index < 0 || index > size){
            throw new IndexOutOfBoundException();
        }
        if(index == 0){
            addFirst(e);
        }else if(index == size){
            addLast(e);
        }else{
            Node <E> temp = head;
            
            for(int i = 0 ; i < index ; i++){
                temp = temp.next;
            }
            
            Node <E> newNode = new Node<>(e,temp,temp.prev);
            temp.prev.next = newNode;
            temp.prev = newNode;
            size++;
            System.out.print("\nadding: " + newNode.element);
        }
    }
    
    public void iterateForward(){
        System.out.print("\niterating forward..\n");
        Node <E> current = head;
        while( current != null){
            System.out.print(current.element);
            System.out.print(" ");
            current = current.next;
        }
    }
    
    public void iterateBackward(){

        System.out.print("\niterating backward..\n");
        
        Node<E> current = tail;
        
        while(current != null){
            System.out.print(current.element + " ");
            current = current.prev;
        }
    }
    
    public E removeFirst(){
        if(size == 0){
            throw new NoSuchElementException();
        }
        Node <E> temp = head;
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.print("\ndeleted: " + temp.element);
        return temp.element;
    }
    
    public E removeLast(){
        if(size == 0 ){
            throw new NoSuchElementException();
        }
        
            Node <E> temp = tail;
            if ( head == tail){
                head = tail = null;
            }else{
                tail = tail.prev;
                tail.next = null;
            }
            size--;
            System.out.print("\ndeleted: " + temp.element);
            return temp.element;
        
    }
    
    public E remove(int index){
        E element = null;
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }else if(index == 0){
            removeFirst();
        }else if(index == size - 1){
            removeLast();
        }else{
            Node <E> temp = head;
            
            for(int i = 0 ; i < index ; i++){
                temp = temp.next;
            }
            
            element = temp.element;
            temp.next.prev = temp.prev;
            temp.prev = temp.next;
            temp.next = null;
            temp.prev = null;
            size--;
            System.out.print("\ndeleted: " + element);
            
        }
        return element;
    }
    
    public void clear(){
        Node<E> temp = head;
        
        while(head != null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        
        tail = null;
        System.out.print("\nSuccessfully clear " + size + " node(s)");
        size = 0;
        
    }
    
    public int getSize(){
        System.out.print("\nSize of current Doubly Linked List : " + size);
        return size;
    }
}
