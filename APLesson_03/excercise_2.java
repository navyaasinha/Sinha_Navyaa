import java.util.Scanner;

public class excercise_2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height?");
		double h = keyboard.nextDouble();
		
		
		System.out.println("What is your weight?");
		double w = keyboard.nextDouble();
		
		System.out.println("You BMI is" + (w*703)/(h*h));
	}
}