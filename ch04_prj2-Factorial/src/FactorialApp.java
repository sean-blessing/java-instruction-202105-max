import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial App");
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			int nbr = sc.nextInt();

			long factorial = 1;
			for (int i=1; i <= nbr; i++) {
				factorial *= i;	// remember, same as fact = fact * i
			}
			
			System.out.println("The factorial of "+nbr+" is "+factorial);
			
			System.out.println("Continue ? (y/n)");
			choice = sc.next();
		}
		
		
		sc.close();
		System.out.println("Bye");

	}

}
