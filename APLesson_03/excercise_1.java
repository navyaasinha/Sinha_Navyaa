import java.util.Scanner; //import Statement

public class excercise_1
{
	public static void main(String[]args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println("Ew." + name + "is the worst name I've ever heard." );
		
		System.out.println("How old are you?");
		int age = keyboard.nextInt();//leaves a return character left over
		System.out.println("Wow!" + age + "is SO old. You might die pretty soon." );
		keyboard.nextLine();//eats the extra return character
		System.out.println("What do you do for fun?");
		String hobby = keyboard.nextLine();
		System.out.println("Gross." + hobby + "sounds SOOOO boring...");
		
		System.out.println("What type of music do you like?");
		String music = keyboard.nextLine();
		System.out.println("You have such bad music taste." + music + "is the worst.");
		
		System.out.println("How many siblings do you have?");
		int sibs = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("I feel bad for those " + sibs + " siblings");
		System.out.println("What do you want to be when you grow up?");
		String job = keyboard.nextLine();
		System.out.println("What makes you think you are good enough to be a " + job );
	}
}