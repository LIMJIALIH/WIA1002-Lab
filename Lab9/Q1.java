
package Lab9;
/*
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string:");
        String s = sc.next();
        
        System.out.print("\nSubstitude of a and i : " + substitudeAI(s));
    }
    
    public static String substitudeAI(String s){
        String sub = "";
        if(s.length() == 1){
            sub = s.substring(0);
        }
        else if(s.length() > 0){
            sub = switch (s.charAt(0)) {
                case 'a' -> "i" + substitudeAI(s.substring(1));
                case 'i' -> "a" + substitudeAI(s.substring(1));
                default -> s.charAt(0) + substitudeAI(s.substring(1));
            };
        }
        return sub;
    }
}
*/