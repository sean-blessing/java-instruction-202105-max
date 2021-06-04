import java.util.Scanner;

public class IfElseApp {

	public static void main(String[] args) {
		//Prompt user for purchase price
		//Calculate total including shipping ($5)
		//Free shipping if purchase price > 50 OR Prime Member
		
		System.out.println("Welcome to our shopping app!");
		Scanner sc = new Scanner(System.in);
		
		final double SHIPPING = 5;
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Purchase Price: ");
			double purchasePrice = sc.nextDouble();
			
			System.out.print("Prime Member? (true/false) ");
			boolean prime = sc.nextBoolean();
			
			if (purchasePrice < 50) {
				if (!prime) {
					purchasePrice += SHIPPING;
				}
			}
			
			System.out.println("Total:  "+ purchasePrice);
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}
		
		
		sc.close();
		System.out.println("Bye");

	}

}
