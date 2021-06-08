import java.util.Scanner;

public class GuessNumberApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		final int LIMIT = 100;
		
		// start game
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number from 1 to "+LIMIT+".  "
					+ "Try to guess it.");
			int number = getRandomNumber(LIMIT);
			System.out.println("HINT:  the number is: "+number);
			System.out.println();
			int count = 0;
			int guess = 0;
			
			while (guess != number) {
				guess = getIntWithinRange(sc, "Enter number: ", 0, 101);
				count++;
				int diff = guess - number;
				if (diff < -10) {
					System.out.println("Way too low!!");
				}
				else if (diff < 0) {
					System.out.println("Too low");
				}
				else if (diff > 10) {
					System.out.println("Way too high!!");
				}
				else if (diff > 0) {
					System.out.println("Too high");
				}
			}
			
			printWinner(count);
			System.out.println();
			
			choice = getRequiredString(sc, "Try again? (y/n)", "y", "n");
		}

		sc.close();
		System.out.println("Bye");

	}
	
	private static void printWinner(int count) {
		System.out.println("You got it in "+count+" tries.");
		if (count <= 3) {
			System.out.println("Great work! You are a mathematical wizard.");
		}
		else if (count <= 7) {
			System.out.println("Not too bad! You've got some potential.");
		}
		else {
			System.out.println("What took you so long? Maybe you should take"
					+ " some lessons.");
		}
	}
	
	private static int getRandomNumber(int limit) {
		return (int) (Math.random() * limit) + 1;
	}
	
	private static String getRequiredString(Scanner sc, String prompt,
											String s1, String s2) {
		String str = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			str = sc.next();
			if (!str.equalsIgnoreCase(s1)&&!str.equalsIgnoreCase(s2)) {
				System.out.println("Invalid entry, try again.");
			}
			else {
				isValid = true;
			}
		}
		
		return str;
	}
	
    public static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(sc, prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

}
