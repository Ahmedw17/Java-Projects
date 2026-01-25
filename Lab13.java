import java.util.Date;

 class Account{
    private int id =0;
    private double balance =0;
    private static double annualInterestRate =0;
    private Date dateCreated;
    
    public Account(){
       dateCreated=new Date() ;
    }
    public Account(int id,double balance ){
        this.id=id;
        this.balance=balance;
        this.dateCreated=new Date();
    }
    public void setId(int id){
        this.id=id;
    }
    
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public static double getAnnualInterestRate(){
        return annualInterestRate; 
    }
    public static void setAnnualInterestRate(double rate){
        annualInterestRate = rate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate /12;
    }
    public double getMonthlyInterest(){
        return balance * annualInterestRate / 100 ;
    }
    public void withdraw(double amount){
        balance -=amount;
    }
    public void deposit(double amount){
        balance +=amount;
    }  
}

public class Lab13 {

    
    public static void main(String[] args) {
       Account acc =new Account(1122,20000);
       Account.setAnnualInterestRate(4.5);
       
       acc.withdraw(2500);
       acc.deposit(3000);
       
       System.out.println("Balance: "+acc.getBalance());
       System.out.println("Monthly Interest : "+acc.getMonthlyInterest());
       System.out.println("Date Created: "+acc.getDateCreated());  
    }
}
