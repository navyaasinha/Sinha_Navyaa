import java.util.Scanner;
public class circle2
{	

	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		int r = kb.nextInt();
		print(calcArea(r));
	
	}
	
	public static double calcArea(int r)
	{
		return (r * r) * 3.14;
	}
	
	
	public static void print(double area)
	{
		System.out.printf("The area is %.5f", area);
	}
	
}