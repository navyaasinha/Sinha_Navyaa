import java.util.Scanner;
public class excercise_052_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Your adventure begins and you are in a haunted house. Would you like to..." +
							"\n a. Go upstairs" +
							"\n b. Go in the basement");
		String choice = kb.next();
		
		if(choice.equals("a"))
		{
			System.out.println("You see a sketchy cat. Would you like to..." +
								"\n a. Shoo the cat away" +
								"\n b. Let the cat be and keep exploring");
			String choice1 = kb.next();
			
			if(choice1.equals("a"))
			{
				System.out.println("You scared the cat away. Would you like to..." +
									"\n a. Walk to the next room?" +
									"\n b. Stay in this room and explore more?");
				String choice2 = kb.next();
				
				if(choice2.equals("a"))
				{
					System.out.println("A murderer is waiting in the next room and stabs you to death.");
				}
				else
				{
					System.out.println("The cat comes back and gives you a disease in which you die the next day");
				}
			}
			else
			{
				System.out.println("You travel down to the basement" +
									"\n a. Go to the wardrobe" +
									"\n b. Walk along the aisle of paintings");
				String choice3 = kb.next();
				
				if(choice3.equals("a"))
				{
					System.out.println("A witch appears out from the wardrobe and haunts you");
				}
				else
				{
					System.out.println("A spider bites you and you die");
				}
			}
		}
		else
		{
			System.out.println("You go into an opening. Would you like to" +
								"\n a. Sit and cry" +
								"\n b. Go into a cave");
			String choice4 = kb.next();
			
			if(choice4.equals("a"))
			{
				System.out.println("You start crying Would you like to..." +
									"\n a. Have someone make you feel better?" +
									"\n b. Want to be left alone?");
				String choice5 = kb.next();
				
				if(choice5.equals("a"))
				{
					System.out.println("Someone tries to make you feel better but they end up killing you");
				}
				else
				{
					System.out.println("You die of lonliness");
				}
			}
			else
			{
				System.out.println("You leave and enter the cave. Would you like to..." +
									"\n a. Stay there" +
									"\n b. Go deep inside the cave");
				String choice6 = kb.next();
				
				if(choice6.equals("a"))
				{
					System.out.println("A bear eats you.");
				}
				else
				{
					System.out.println("You make food and survive!");
				}
			}
		}
	}
}
