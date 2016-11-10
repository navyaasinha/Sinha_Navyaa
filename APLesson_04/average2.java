import java.util.Scanner;
public class average2
{	

	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int num1 = kb.nextInt();
		System.out.println("Enter number 2 : ");
		int num2 = kb.nextInt();
		System.out.println("Enter number 3 : ");
		int num3 = kb.nextInt();
		print(calcAverage(num1, num2, num3));
	
	}
	
	public static int calcAverage(num1, num2, num3);
	{
		return (num1 + num2 + num3)/3;
	}
	
	
	public static void print(int average)
	{
		System.out.printf("The average is " + average);
	}
	
}