package Lab7;

import java.util.LinkedList;
public class MyQueue <E> {

    private LinkedList<E> list;
    
    public MyQueue(){
        this.list = new LinkedList <>();
    }
    
    public MyQueue(E [] e){
        list = new LinkedList <>();
        for(int i = 0 ; i < e.length ; i++){
            this.list.addLast(e[i]);
        }
    }
    
    public void enqueue(E e){
        list.addLast(e);
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
    
    public E getElement(int i){
        return list.get(i);
    }
    
    public E peek(){
        return list.peekFirst();
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean contains(E e){
        return list.contains(e);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
   }
    
    public void replace(E e){
        list.removeFirst();
        list.addFirst(e);
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
