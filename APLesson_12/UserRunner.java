import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("First name: ");
		String firstName = kb.nextLine();
		System.out.println("Last name:");
		String lastName = kb.nextLine();
		System.out.println("Do you want to enter a public avatar:");
		String choice = kb.nextLine();
		
		if (choice.equals("n"))
		{
			User pH = new User(firstName, lastName);
			System.out.println(pH);
		}
		if (choice.equals("y"))
		{
			System.out.println("Enter avatar: ");
			String avatar = kb.nextLine();
			User pH2 = new User(firstName, lastName, avatar);
			System.out.println(pH2);
		}
	}
}