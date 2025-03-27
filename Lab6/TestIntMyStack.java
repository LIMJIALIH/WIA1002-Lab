package Lab6;
/*
import java.util.Scanner;

public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nPlease enter integer values:");
        
        MyStack <Integer> stack = new MyStack<>();
        
        while(true){
            int number = sc.nextInt();
            
            if(number < 0){
                break;
            }
            
            stack.push(number);
            
        }
        
        System.out.print("\nSize of the stack is " + stack.getSize());
        int cnt = stack.getSize();
        
        for (int i = 0 ; i<cnt ; i++){
            System.out.print("\n" + stack.pop());
        }
    }
}

/*
The output of the elements are the desc order of the original input elements. This is 
because when calling out pop method from stack, it will remove and return the top first 
element, which is (size - 1) element.     
*/
