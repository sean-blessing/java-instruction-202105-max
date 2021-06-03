import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator app!");

		// p. 55 - Scanner
		Scanner sc = new Scanner(System.in);

		// p. 69 while loop start
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter a whole number: ");
			int n1 = sc.nextInt();
			System.out.print("Enter another whole number: ");
			int n2 = sc.nextInt();
			int sum = n1 + n2;
			System.out.println("Sum = " + sum);

			int difference = n2 - n1;
			System.out.println("Difference = " + difference);

			int product = n2 * n1;
			System.out.println("Product = " + product);

			// quotient
			System.out.println("Quotient = " + (n2 / n1));

			int modulus = n2 % n1;
			System.out.println("Modulus = " + modulus);

			// while loop end
			System.out.print("Continue? (y/n)");
			choice = sc.next();
		}
		System.out.println("Bye");
		sc.close();
	}

}
