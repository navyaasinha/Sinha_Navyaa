import java.util.Scanner;
public class excercise_6_2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = kb.nextInt();
		int fac = 1;
		for(int i = 1; i <= num; i++)
		{
			fac*=i;
		}
		System.out.println(fac);
	}
}
