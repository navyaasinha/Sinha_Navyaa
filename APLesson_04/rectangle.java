import java.util.Scanner;
public class rectangle
{	
		static double l;
		static double w;
		static double perimeter;
		
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		l = kb.nextDouble();
		System.out.println("Enter width: ");
		w = kb.nextDouble();
		
		
		calcPerimeter();
		print();
	
	}
	
	public static void calcPerimeter()
	{
		perimeter = (l*w);
	}
	
	
	public static void print()
	{
		System.out.printf("The perimeter is %.5f", perimeter);
	}
	
}