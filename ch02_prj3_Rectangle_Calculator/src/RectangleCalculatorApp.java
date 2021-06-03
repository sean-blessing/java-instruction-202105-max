import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Rectangle Calculator!");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.println();
			System.out.print("Enter length: ");
			double length = sc.nextDouble();
			System.out.print("Enter width: ");
			double width = sc.nextDouble();

			double area = length * width;
			double perimeter = 2 * length + 2 * width;

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
		}

		sc.close();
		System.out.println("Bye");

	}

}
