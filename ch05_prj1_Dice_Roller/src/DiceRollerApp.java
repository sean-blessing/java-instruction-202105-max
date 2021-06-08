import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller App");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String choice = getNextString(sc, "Roll the dice? (y/n)");
		
		while (choice.equalsIgnoreCase("y")) {
			int die1 = rollDie();
			int die2 = rollDie();
			
			printResults(die1, die2);
			
			System.out.println();
			choice = getNextString(sc, "Roll again? (y/n)");
		}
		
		sc.close();
		System.out.println("Bye");

	}
	
	private static void printResults(int die1, int die2) {
		int total = die1 + die2;
		System.out.println("Die1:  "+die1);
		System.out.println("Die2:  "+die2);
		System.out.println("Total: "+total);
		if (total == 2) {
			System.out.println("Snake eyes!");
		}
		else if (total == 12) {
			System.out.println("Box cars!");
		}
	}
	
	private static String getNextString(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.next();
	}
	
	private static int rollDie() {
		return (int) (Math.random() * 6) + 1;
	}

}
