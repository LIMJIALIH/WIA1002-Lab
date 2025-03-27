
package Lab1;
/*
import java.util.ArrayList;
import java.util.Date;

class Account{
    protected int id;
    protected double balance;
    protected double annualInterestRate;
    protected Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate()/100;
    }
    
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.print("\nYou dont have enough balance to withdraw $" + amount);
        }
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    @Override
    public String toString(){
        return "Balance: $" + balance + "\nMonthly Interest: $" + getMonthlyInterest() + "\nDate Create: " + getDateCreated();
    }
    
    
}

//public class Q3 {
//    public static void main(String[] args) {
//        Account acc = new Account(1122,20000);
//        acc.setAnnualInterestRate(4.5);
//        acc.withdraw(2500);
//        acc.deposit(3000);
//        System.out.print(acc.toString());
//        
//    }
//}

class Account1 extends Account{
    private String name;
    private ArrayList<Transaction> transactions;
    
    public Account1 (String name, int id, double balance){
        super(id,balance);
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    
    public void withdraw(double amount,String description){
        if(balance>=amount){
            balance -= amount;
            transactions.add(new Transaction('W',amount,balance,description));
        }else{
            System.out.print("\nAmount of balance is not enough.");
        }
    }
    
    public void deposit(double amount,String description){
        balance += amount;
        transactions.add(new Transaction('D',amount,balance,description));
    }
    
    @Override
    public String toString(){
        return String.format("""
                             Name:%s
                             Interest Rate:%.2f%%
                             Balance: $%.2f
                             """,name,getAnnualInterestRate(),getBalance());
    }
    
    public void displayTransaction(){
        for(Transaction transaction:transactions){
            System.out.print("\n" + transaction.toString());
        }
    }
}

class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transaction(char type, double amount,double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }
    
    @Override
    public String toString(){
        return String.format("[%s] Type: %c | Amount: $%.2f | Balance: $%.2f | Description: %s",
                         date.toString(), type, amount, balance, description);
    }
}

public class Q3Q4{
    public static void main(String[] args) {
        Account1 acc = new Account1("George",1122,1000);
        acc.setAnnualInterestRate(1.5);
        
        acc.deposit(30, "Part Time");
        acc.deposit(40, "Rent");
        acc.deposit(50, "Salary");
        
        acc.withdraw(5, "Foods");
        acc.withdraw(4, "Drinks");
        acc.withdraw(3, "Attire");
        
        System.out.print("\n" + acc.toString());
        acc.displayTransaction();
    }
}
*/