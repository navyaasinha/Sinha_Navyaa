import java.util.Scanner;
public class excercise_502
{
	public static void main (String[]args);
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter item 1:");
		String item1 = kb.next();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item 2:");
		String item2 = kb.next();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item 3:");
		String item3 = kb.next();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		System.out.println("Please enter item 4:");
		String item4 = kb.next();
		System.out.println("Please enter the price:");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total - discount + tax;
		
		System.out.println("<<<<<<<<Reciept>>>>>>>>>>>");
		format(item1, price1);
		format("Subtotal:", subtotal);
		System.out.println("Thank you");
		
		
	}
	
	public static double calcDisc(double sub)
	{
		if (sub>= 2000)
			return sub * 0.15;
		return 0.0;
	}
	
	public static void format (String item, double price)
	{
		System.out.printf("%10s item + "............" + price);
	}
	
}