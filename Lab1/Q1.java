
package Lab1;
/*
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
//        System.out.print("\nPart 1\n\n");
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("LimJiaLih_24004471.txt"));
            writer.write("""
                         Thursday,20 March 2025.
                         
                         My name is Lim Jia Lih with matrix number, 24004471. I am 
                         majoring in Artificial Intelligence. This is my first time taking 
                         Data Structure subject. At this moment, I am feeling excited about taking this 
                         subject. This is because I am enthusiastic in programming and improve myself 
                         
                         I acquired () for my previous Programming 1 course. It's not too bad. So, I 
                         think I can manage to get A for this DS subject this term. In order 
                         to do well in the subject, I will conduct more questions as well as project 
                         that is beneficial for me. Wish me luck!!!""");
            
            writer.close();
        }catch(IOException e){
            System.out.print("\nError in writing the file");
        }
        
//        try{
//            BufferedReader reader = new BufferedReader(new FileReader("LimJiaLih_24004471.txt"));
//            
//            String line;
//            
//            while((line = reader.readLine()) != null){
//                System.out.print(line + "\n");
//            }
//            reader.close();
//            
//        }catch(FileNotFoundException e){
//            System.out.print("\nFile not found");
//        }catch(IOException e){
//            System.out.print("\nError in reading the file");
//        }
        
//        System.out.print("\nPart 2\n\n");
        
        String consoleInput = readFromConsole();
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("LimJiaLih_24004471.txt",true));
            
            writer.write("\n\nThursday, 20 July 2025.\n\n" + consoleInput);
            writer.close();
        }catch(IOException e){
            System.out.print("\nError in writing the file");
        }
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("LimJiaLih_24004471.txt"));
            
            String line;
            
            while((line = reader.readLine()) != null){
                System.out.print(line + "\n");
            }
            reader.close();
            
        }catch(FileNotFoundException e){
            System.out.print("\nFile not found");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
        
        
    }
    
    public static String readFromConsole(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
}
*/