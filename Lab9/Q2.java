
package Lab9;
/*
import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    
    private static ArrayList<String> list;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = "ABC";
        System.out.print("\nOutput permutation : " + permuteString(input));
    }
    
    public static ArrayList<String> permuteString(String s){
        ArrayList<String> permutations = new ArrayList<>();
        
        if(s.length() == 0){
            permutations.add("");
            return permutations;
        }
        
        char firstChar = s.charAt(0);
        String remain = s.substring(1);
        ArrayList<String> words = permuteString(remain);
        
        for(String word : words){
            for(int i = 0 ; i <= word.length() ; i++){
                permutations.add(addCharacters(word,firstChar,i));
            }
        }
        return permutations;
    }

    private static String addCharacters(String word, char firstChar, int i) {
        String first = word.substring(0,i);
        String last = word.substring(i);
        return first+ firstChar + last;
    }
    
}
*/