import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter distance: ");
		int distance = kb.nextInt();
		System.out.println("enter hours: ");
		int hours = kb.nextInt();
		System.out.println("enter minutes: ");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object.getDistance() + " miles in " + object.getHour() + " hours = " + object.getmph() + " mph");
		
		object.setMilesPerHour(500, 5, 30);
		System.out.println(object.getDistance() + " miles in " + object.getHour() + " hours = " + object.getmph() + " mph");
	}
}
