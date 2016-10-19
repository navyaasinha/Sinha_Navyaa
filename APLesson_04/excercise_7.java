import java.util.Scanner;
public class excercise_7
{
		static double r;
		static double Area;
	
	public static void main(String[]args)
	
	{
		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the radius: ");
		r = kb.nextDouble();
		
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		Area = r * 3.14 * r;
	}
	
	public static void print()
	{
		System.out.printf("The area of the circle is %.5f", Area);
	}
	
}