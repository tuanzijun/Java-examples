import java.util.Date;

public class bank {
    public static void main(String agrs[]){
    Account a1 = new Account(1124,20000);
    a1.setAnnuallnterestRate(0.045);
    a1.withDrew(2500);
    a1.deposit(3000);
    System.out.println("开户日期："+a1.getDateCreated().toString()+"\n余额："+a1.getBalance()+"    月利息："+a1.getMonthlyInterestRate());

    }
}

class Account{
    private int id ;
    private double balance ;
    private double annuallnterestRate;
    private Date dateCreated = new Date();
    
    public Account(){
        id = 0;
        balance =0;
        annuallnterestRate = 0;
    }
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
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

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return this.annuallnterestRate/12;
    }
    public void withDrew(double i){
        this.balance -= i;
    }
    public void deposit(double i){
        this.balance += i;
    }
}
