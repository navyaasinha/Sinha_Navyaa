import java.util.Scanner;
public class excercise_6_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please a word: ");
		String word = kb.next();
		
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
	}
}