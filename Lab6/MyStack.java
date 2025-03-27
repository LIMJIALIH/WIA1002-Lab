package Lab6;

import java.util.ArrayList;

public class MyStack <E> {
    
    private ArrayList<E> list;
    
    public MyStack(){
        list = new ArrayList<>();
    }
    
    public void push(E O){
        list.add(O);
    }
    
    public E pop(){
        E temp = list.get(list.size()-1);
        list.remove(list.size()-1);
        
        return temp;
    }
    
    public E peek(){
        return list.get(list.size()-1);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public boolean search(E o){
        for(int i = 0 ; i<list.size() ; i++){
            if(list.get(i).equals(o)){
                return true;
            }
        }
        return false;
    }
    
//    // Q3
//    public int getSum(){
//        int total = 0;
//        for(int i = 0 ; i<getSize() ; i++){
//            total += (int)list.get(i);
//        }
//        return total;
//    }
}
