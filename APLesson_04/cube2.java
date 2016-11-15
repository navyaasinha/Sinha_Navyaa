import java.util.Scanner;
public class cube2
{	

	public static void main(String[]args)
	
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter side: ");
		int s = kb.nextInt();
		print(calcSurf(s));
	
	}
	
	public static int calcSurf(int s)
	{
		return (6*s*s);
	}
	
	
	public static void print(int sa)
	{
		System.out.printf("The surface area is "+ sa);
	}
	
}