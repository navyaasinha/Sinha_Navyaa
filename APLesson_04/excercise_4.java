import java.util.Scanner;
public class excercise_4
{
	public static void main(String[]args)
	{
		excercise_4 subwooferBox = new excercise_4();
		
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the height in inches: ");
		double h = keyboard.nextDouble();
		System.out.println("Enter the the length in inches: ");
		double l = keyboard.nextDouble();
		System.out.println("Enter the the width in inches: ");
		double w = keyboard.nextDouble();
		
		
		
		System.out.printf("The volume of your subwoofer box is is " + subwooferBox.calcVol(h, l, w) + "in cubic feet");
	}
	public double calcVol(double h, double l, double w)
	{
		return (h*l*w/12);
	}
}