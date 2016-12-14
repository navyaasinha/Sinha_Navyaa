import java.util.Scanner;
public class excercise_702
{
	static int number;
	static int digit = 0;
	static int average = 0;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = kb.nextInt();
		avgDigits();
		System.out.println("The average of the digits in " + number + " is " + average);
	}
	public static void avgDigits()
	{
		int num = number;
		int sum = 0;
		while(num > 0)
		{
			digit += 1;
			sum += num%10;
			num /=10;
		}
		average = (sum/digit);
	}
}
