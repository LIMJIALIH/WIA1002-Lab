
package Lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
public class Q2 {
    public static void main(String[] args) {
        
        getNumChar("text1.txt",",");
        getNumChar("text2.txt",", ");
        getNumChar("text3.txt","; ");
        getNumChar("text4.txt","[\\d]+");
    }
    
    public static void getNumChar(String file, String delimitor){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            int Cnt = 0;
            String line;
            
            while((line = reader.readLine()) != null){
                String [] character = line.split(delimitor);
                Cnt += character.length;
                for(String characters: character){
                    System.out.print("\n" + characters);
                }
            }
            
            reader.close();
            
            System.out.printf("\nThe total number of characters retrieved from %s is %d",file,Cnt);
            
        }catch(FileNotFoundException e){
            System.out.print("\nFile not found");
        }catch(IOException e){
            System.out.print("\nError in reading the file");
        }
    }
}
*/