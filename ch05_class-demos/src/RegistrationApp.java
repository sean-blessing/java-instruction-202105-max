import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistrationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Registration App");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			String fName = getNextString(sc, "Enter first name: ");

			String lName = getNextString(sc, "Enter last name: ");

			int age = getNextIntWithinRange(sc, "Enter your age (years): ", 1, 100);

			System.out.println("Welcome, " + fName + " " + lName + "(" + age + ")");

			choice = getNextString(sc, "Continue? (y/n) ");
		}
		sc.close();
		System.out.println("Bye");

	}

	private static int getNextIntWithinRange(Scanner sc, String prompt, int min, int max) {
		int nbr = 0;
		boolean isValid = false;

		while (!isValid) {
			nbr = getNextInt(sc, prompt);
			if (nbr < min) {
				System.out.println("Sorry...  input must be greater than," + " or equal to " + min);
			} else if (nbr > max) {
				System.out.println("Sorry...  input must be less than," + " or equal to " + max);
			} else {
				isValid = true;
			}
		}
		return nbr;
	}

	private static int getNextInt(Scanner sc, String prompt) {
		int nbr = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				nbr = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Invalid whole number.  Try again.");
				if (sc.hasNextLine())
					sc.nextLine();
			}
		}
//			try {
//				System.out.print(prompt);
//				nbr = sc.nextInt();
//				break;
//			} catch (InputMismatchException ime) {
//				System.out.println("Invalid whole number.  Try again.\n");
//				// discard input
//				sc.nextLine();
//				continue;
//			}
		return nbr;

	}

	// new method to:
	// 1) prompt user for input
	// 2) use scanner to get next string
	private static String getNextString(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.next();
	}

	// Having some weird issues clearing the scanner of old data.
	// Built this method to remedy.
//	private static Scanner discardScannerEntries(Scanner sc) {
//		// while there's still stuff in the scanner,
//		// call nextLine to get rid of it!
//		while (sc.hasNext()) {
//			sc.nextLine();
//		}
//		// that didn't work... how about resetting sc to new Scanner?
//		return new Scanner(System.in);
//	}

}
