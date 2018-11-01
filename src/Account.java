
import java.util.Date;

public class Account
{
    private int id=0;
    private double balance=0;

    private double annualInterestRate=0;

    private Date dateCreated;

    public Account()
    {
        id=0;
        balance=0;
        dateCreated=new Date();

    }

    //Constructor with inputs
    public Account(int id,double balance)
    {
        this.id=id;
        this.balance=balance;
        dateCreated=new Date();

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

    public double getMonthlyInterestRate()
    {
        return (this.annualInterestRate/1200)*getBalance();
    }

    public double getMonthlyInterest()
    {
        return (this.annualInterestRate);
    }

    public void withdraw(double valueToWithdraw)
    {
        this.balance=this.balance-valueToWithdraw;

    }

    public void deposit(double valueToDeposit)
    {
        this.balance=this.balance+valueToDeposit;
    }

}
