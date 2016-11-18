import java.util.Scanner;
public class excercise_6_4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the size of the table: ");
		int table = kb.nextInt();
		System.out.println("Enter an integer: ");
		int integer = kb.nextInt();
		for(int i = 1; i <=table; i++)
		{
			System.out.printf("%5d       %5d\n", i, i*integer);
		}

	}
}
