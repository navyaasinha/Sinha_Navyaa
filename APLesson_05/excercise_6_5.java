import java.util.Scanner;
public class excercise_6_5
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int num = kb.nextInt();
		System.out.println("Enter the increment: ");
		int inc = kb.nextInt();

		for(int i = inc; i <= num; i+=inc)
		{
			System.out.print(i + " ");
		}

	}
}