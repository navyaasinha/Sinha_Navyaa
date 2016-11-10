import java.util.Scanner;
public class circle
{	
		static double r;
		static double cirlce;
		static double area;
		
	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		r = kb.nextDouble();
		
		
		calcArea();
		print();
	
	}
	
	public static void calcArea()
	{
		area = (r*r*3.14);
	}
	
	
	public static void print()
	{
		System.out.printf("The area is %.5f", area);
	}
	
}