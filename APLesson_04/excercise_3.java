import java.util.Scanner;
public class excercise_3
{
	public static void main(String[]args)
	{
		excercise_3 compInt = new excercise_3();
		
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the interest rate: ");
		double r = keyboard.nextDouble();
		System.out.println("Enter the the amount you intend to borrow: ");
		double p = keyboard.nextDouble();
		System.out.println("Enter the the number of times the loan is compounded per year: ");
		double n = keyboard.nextDouble();
		System.out.println("Enter the life of the loan in years: ");
		double t = keyboard.nextDouble();
		
		
		
		System.out.printf("Your total monthly payment is " + compInt.payment(r, p, n, t));
	}
	public double payment(double r, double p, double n, double t)
	{
		return (p*(Math.pow(1+r/n, n*t)))/(12*t);
	}
}