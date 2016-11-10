import java.util.Scanner;
public class cube
{	
		static double side;
		static double SA;
		static double cube;
		
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter side length: ");
		side = kb.nextDouble();
		
		
		calcSA();
		print();
	
	}
	
	public static void calcSA()
	{
		SA = (side*side*6);
	}
	
	
	public static void print()
	{
		System.out.printf("The suface area is %.5f", SA);
	}
	
}