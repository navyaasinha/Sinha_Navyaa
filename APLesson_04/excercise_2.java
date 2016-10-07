import java.util.Scanner;

public class excercise_2

{
	public static void main(String [] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		excercise_2 id = new excercise_2();
		
		
		System.out.println("Enter your first name: ");
		String firstName = keyboard.next();
	
		System.out.println("Enter your last name: ");
		String lastName = keyboard.next();	
		
		System.out.println("Enter your title: ");
		String title = keyboard.next();
		keyboard.nextLine();
		
		System.out.println("Enter the school site: ");
		String school = keyboard.nextLine();
		
		System.out.println("Enter the school year: ");
		String year = keyboard.nextLine();
		
		System.out.println("What is your subject?");
		String subject = keyboard.next();
		
		System.out.println("******************************************");
		id.format(school, year);
		id.format(lastName, firstName);
		id.format(title, subject);
		System.out.println("******************************************");
	}
	
	public void format(String one, String two)
	{
		System.out.printf("* %15s%15s\n", one, two);		
	}
}