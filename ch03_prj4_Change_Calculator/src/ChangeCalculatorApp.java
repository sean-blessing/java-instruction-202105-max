import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator App!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Number of cents (0-99):  ");
			int cents = sc.nextInt();
			
			int quarters = cents / 25;
			int remainder = cents % 25;
			
			int dimes = remainder / 10;
			remainder = remainder % 10;
			
			int nickels = remainder / 5;
			remainder = remainder % 5;

			System.out.println("Quarters:  "+quarters);
			System.out.println("Dimes:     "+dimes);
			System.out.println("Nickels:   "+nickels);
			System.out.println("Pennies:   "+remainder);
			
			
			
			System.out.println("Continue(y/n)? ");
			choice = sc.next();
		}
		
		
		
		sc.close();
		System.out.println("Bye");

	}

}
