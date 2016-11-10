import java.util.Scanner;
public class rectangle2
{	

	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int l = kb.nextInt();
		System.out.println("Enter width: ");
		int w = kb.nextInt();
		print(calcPerim(l, w));
	
	}
	
	public static int calcPerim(int l, int w)
	{
		return (2*l*w);
	}
	
	
	public static void print(int perimeter)
	{
		System.out.printf("The perimeter is " + perimeter);
	}
	
}