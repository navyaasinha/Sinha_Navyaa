import java.util.Scanner;

public class excercise_1
{
	public static void main(String [] args)
	{
		//Scanner object
		Scanner keyboard = new Scanner(System.in);
		//instantiate an object
		excercise_1 receipt = new excercise_1();
		
		//user inputs - item 1
		System.out.println("Please enter item 1: ");
		String item1 = keyboard.next();
		System.out.println("Please enter the price: ");
		Double price1 = keyboard.nextDouble();
		
		//user inputs - item 2
		System.out.println("Please enter item 2: ");
		String item2 = keyboard.next();	
		System.out.println("Please enter the price: ");
		Double price2 = keyboard.nextDouble();
		
		//user inputs - item 3	
		System.out.println("Please enter item 3: ");
		String item3 = keyboard.next();
		System.out.println("Please enter the price: ");
		Double price3 = keyboard.nextDouble();
		
		//print receipt title 
		System.out.println("<<<<<<<<<<<<<<<<Receipt>>>>>>>>>>>>>>>>");
		//method call
		receipt.format(item1, price1);
		//method call
		receipt.format(item2, price2);
		//method call
		receipt.format(item3, price3);
		receipt.format("Subtotal", price1 + price2 + price3);
		receipt.format("Tax", 0.075 * (price1 + price2 + price3));
		receipt.format("Total", (price1 + price2 + price3) + (0.075* price1 + price2 + price3));
		//print horizontal line
		//print thank you message
		System.out.println("Thank you for your support");
	}
	
	public void format(String one, double two)
	{
		//code that formats all of the line items in the receipt
		System.out.printf("* %10s ........ %10.2f\n", one, two);		
	}
}