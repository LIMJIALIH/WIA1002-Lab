package Lab6;

//class TowerOfHanoi {

import java.util.Comparator;
import java.util.PriorityQueue;

//    private MyStack<Integer> source, auxiliary, destination;
//    private int numDisks;
//
//    public TowerOfHanoi(int numDisks) {
//        this.numDisks = numDisks;
//        source = new MyStack<>();
//        auxiliary = new MyStack<>();
//        destination = new MyStack<>();
//
//        // Push disks onto the source stack (largest disk at the bottom)
//        for (int i = numDisks; i >= 1; i--) {
//            source.push(i);
//        }
//    }
//
//    // Move disks from source to destination using auxiliary
//    public void solve() {
//        printStacks();
//        moveDisks(numDisks, source, destination, auxiliary);
//    }
//
//    private void moveDisks(int n, MyStack<Integer> src, MyStack<Integer> dest, MyStack<Integer> aux) {
//        if (n > 0) {
//            // Move n-1 disks from source to auxiliary using destination
//            moveDisks(n - 1, src, aux, dest);
//
//            // Move the nth disk from source to destination
//            dest.push(src.pop());
//            printStacks();
//
//            // Move n-1 disks from auxiliary to destination using source
//            moveDisks(n - 1, aux, dest, src);
//        }
//    }
//
//    // Print the current state of all stacks
//    private void printStacks() {
//        System.out.println("\nSource: " + source);
//        System.out.println("Auxiliary: " + auxiliary);
//        System.out.println("Destination: " + destination);
//        System.out.println("-------------------------");
//    }
//
//    public static void main(String[] args) {
//        int numDisks = 3; // Change this value for different test cases
//        TowerOfHanoi tower = new TowerOfHanoi(numDisks);
//        tower.solve();
//    }
//}
//
//import java.util.Scanner;
//    public class Q5{
//        
//        private static MyStack <Integer> src = new MyStack<>();
//        private static MyStack <Integer> aux = new MyStack<>();
//        private static MyStack <Integer> dest = new MyStack<>();
//        
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            
//            
//            System.out.print("\nEnter the number of rings:");
//            int  disk = sc.nextInt();
//            
//            for(int i = disk ; i>=1 ; i--){
//                src.push(i);
//            }
//            
//            print();
//            solve(disk, src, dest, aux);
//            
//        }
//        
//        public static void print(){
//            System.out.print("\nSource: " + src.toString());
//            System.out.print("\nAuxilliary: " + aux.toString());
//            System.out.print("\nDestination: " + dest.toString());
//            System.out.print("\n\n");
//        }
//        
//        public static void solve(int n , MyStack<Integer> src, MyStack<Integer> dest, MyStack<Integer> aux){
//            if(n > 0){
//                solve(n-1,src , aux, dest);
//                
//                dest.push(src.pop());
//                print();
//                
//                solve(n-1, aux, dest, src);
//            }
//        }
//    }
