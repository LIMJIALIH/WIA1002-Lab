package Lab6;

public class TestMyStack {
    public static void main(String[] args) {
        
        MyStack <Character> stack = new MyStack <>();
        
        stack.push('a');
        stack.push('b');
        stack.push('c');
        
        System.out.print("\n" + stack.toString());
        
        System.out.print("\nIs 'b' in the stack : " + stack.search('b'));
        System.out.print("\nIs 'k' in the stack : " + stack.search('k'));
        
        MyStack <Integer> anotherStack = new MyStack <>();
        
        anotherStack.push(1);
        anotherStack.push(2);
        anotherStack.push(3);
        
        System.out.print("\n" + anotherStack.toString());
        
        System.out.print("\nIs 6 in the stack : " + anotherStack.search(6));
        
        
        
    }
}
