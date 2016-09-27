import java.util.Scanner;

public class excercise_3
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many banana's do you own?");
		double h = keyboard.nextDouble();
		
		
		System.out.println("How many banana's did you eat?");
		double w = keyboard.nextDouble();
		
		System.out.println("You have" + (h-w) + "bananas left");
	}
}