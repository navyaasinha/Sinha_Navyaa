public class excercise_5.01
{
	int player;
	int computer;
	
	public static void main(String[]args)
	{
		player = (Math.random()*7)+1;
		computer = (Math.random()*7)+1;
		diceRoll();
		System.out.printlm("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("And the winner is "+ winner);
	}
	
	public static void diceRoll()
	{
		if (player > computer)
			winner = player;
		if (computer > player)
			winner = computer;
	}
		
}
