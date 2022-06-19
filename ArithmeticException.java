import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try{
		    System.out.println("Answer is : "+a/b);   
		}
		catch(ArithmeticException e)
		{
		    System.out.println("Dont do divide by 0 \n"+e);
		}
	}
}
