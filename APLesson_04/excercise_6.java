import java.util.Scanner;
public class excercise_6
{
		static double s;
		static double SA;
	
	public static void main(String[]args)
	
	{
		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the side: ");
		s = kb.nextDouble();
		
		calcSA();
		print();
	}
	
	public static void calcSA()
	{
		SA = 6*(s*s);
	}
	
	public static void print()
	{
		System.out.printf("The surface area of the cube is %.5f", SA);
	}
	
}