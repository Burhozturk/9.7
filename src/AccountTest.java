import static org.junit.Assert.*;

public class AccountTest
{
    public static void main(String[] args)
    {
        Account accountone=new Account(1122,20000);
        accountone.setAnnualInterestRate(4.5);
        accountone.withdraw(2500);
        accountone.deposit(3000);
        System.out.print(accountone.getBalance());
        System.out.print(accountone.getMonthlyInterest());
        System.out.println(accountone.getDateCreated());


    }

}