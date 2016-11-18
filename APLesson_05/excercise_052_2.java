import java.util.Scanner;
public class excercise_052_2
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}	
	
	public static void passCheck()
	{
		System.out.println("Please enter your username:");
		String username = kb.next();
		System.out.println("Please enter your password:");
		String password = kb.next();
		
		if (username.equals("sinha7963") && password.equals("tennis"))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if (username.equals("sinha7963"))
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			else if (password.equals("tennis"))
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password is incorrect!");
				passCheck();
			}
			
		}
	}
}
