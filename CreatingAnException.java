import java.util.*;
class LowBalanceException extends RuntimeException
{
    LowBalanceException(String s)
    {
        super(s);
    }
}
public class Main
{
    int balance = 10000;
    void withdraw(int amt)
    {
        if(amt>balance)
        {
            throw new LowBalanceException("You don't have enough balance !!");
        }
        else{
            balance-=amt;
        }
    }
	public static void main(String[] args) {
	    Main a = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn : ");
		int amt = sc.nextInt();
		a.withdraw(amt);
		System.out.println("Remaining balance is : "+a.balance);
	}
}
