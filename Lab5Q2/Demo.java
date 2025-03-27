
package Lab5Q2;
/*
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <String> linkedList = new LinkedList<>();
        System.out.print("\nEnter your student name list. Enter 'n' to end...\n");
        while(true){
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("n")){
                break;
            }
            linkedList.add(name);
        }
        
        System.out.print("\nYou have entered the following students' name : \n");
        linkedList.printList();
        
        System.out.print("\n\nThe number of students entered is : " + linkedList.getSize());
        
        System.out.print("\n\nAll the entered are correct? Enter 'r' to rename the student name, 'n' to proceed.\n");
        String choice = sc.next();
        
        sc.nextLine();
        
        if(choice.equalsIgnoreCase("r")){
            System.out.print("\nEnter the existing student name that u wnat to rename : \n");
            String rename = sc.nextLine();
            
            System.out.print("\nEnter the new name : \n");
            String newName = sc.nextLine();
            
            linkedList.replace(rename, newName);
            
            System.out.print("\nThe new student list is : \n");
            linkedList.printList();
        }
        
        System.out.print("\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.\n");
        String ch = sc.next();
        
        if(ch.equalsIgnoreCase("y")){
            sc.nextLine();
            
            System.out.print("\nEnter a student name to remove : \n");
            String removeName = sc.nextLine();
            
            linkedList.removeElement(removeName);
            
            System.out.print("\nThe number of updated studetn is : " + linkedList.getSize());
            System.out.print("\nThe updated student list is : \n");
            linkedList.printList();
        }
        System.out.print("\n\nAll student data captured complete. Thank you!");
        
        
    }
    
}
*/