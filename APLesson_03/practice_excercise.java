import java.util.Scanner; //import Statement

public class practice_excercise
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt
		System.out.println("How old are you?");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print results...
		System.out.println("Wow!" + num + "is perfect. Your pretty handsome." );
	}
}