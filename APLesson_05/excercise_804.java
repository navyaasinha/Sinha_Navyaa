import java.util.Scanner;
public class excercise_804
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first word: ");
		String word = kb.nextLine();
		int stop = word.length();
		int start = 1;
		tree(word, start, stop);
	}
	
	public static void tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.println(makeCenter(word.substring(0, start)));
			start += 1;
			tree(word, start, stop);
			
		}
	}
	public static String makeCenter(String word)
	{
		if (word.length() >= 20)
		{
			return word;
		}
		else
		{
			return makeCenter(" " + word);
		}
	}
}