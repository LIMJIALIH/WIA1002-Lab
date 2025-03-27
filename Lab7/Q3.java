
package Lab7;
/*
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        MyQueue <Integer> shares = new MyQueue<>();
        MyQueue <Integer> price = new MyQueue <>();
        
        double totalPrice = 0;
        
        System.out.print("\nEnter your query (In format 'Buy / Sell x shares at $y each):");
        String content = sc.nextLine();
        
        while(true){
            if(content.length() < 5){
                break;
            }
            
            String [] info = content.split("[\\s]");
            int amountShare = Integer.parseInt(info[1]);
            int sharePrice = Integer.parseInt(info[4].substring(1));
            
            
            if(info[0].equalsIgnoreCase("Buy")){
                System.out.print("\nBuying now...");
                shares.enqueue(amountShare);
                price.enqueue(sharePrice);
            }else{
                System.out.print("\nSelling the shares now...");
                int first = shares.peek();
                if(first > amountShare){
                    shares.replace(first - amountShare);
                    double net = (sharePrice - price.peek()) * amountShare;
                    totalPrice += net;
                    System.out.print("\nTotal Capital Gain / Loss: " + totalPrice);

                }else{
                    while ( amountShare > 0 && !shares.isEmpty()){
                        first = shares.peek();
                        if(amountShare >= first){
                            int allShare = shares.dequeue();
                            int dequePrice = price.dequeue();
                            double net = (sharePrice - dequePrice) * allShare;
                            totalPrice += net;
                            amountShare -= allShare;
                            System.out.print("\nTotal Capital Gain / Loss: " + totalPrice);
                            if(shares.isEmpty()){
                                System.out.print("\nNo shares to sell!");
                            }
                        }
                        else{
                            shares.replace(first - amountShare);
                            double net = (sharePrice - price.peek())*amountShare;
                            totalPrice += net;
                            amountShare = 0;
                            System.out.print("\nTotal Capital Gain / Loss: " + totalPrice);
                        }
                    }
                }
            }
            
            System.out.print("\nQueue for Share: Queue: " + shares.toString());
            System.out.print("\nQueue for Price: Queue: " + price.toString());
            
            
            System.out.print("\nEnter your query (In format 'Buy / Sell x shares at $y each):");
            content = sc.nextLine();
            
        }
        System.out.print("\nFinal Capital Gain / Loss: " + totalPrice);
    }
}
*/