import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Converter App!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			// user input
			System.out.print("Enter numeric grade: ");
			int numericGrade = sc.nextInt();
			
			// biz logic
			String letterGrade = "F";
			if (numericGrade >= 88) {
				letterGrade = "A";
			}
			else if (numericGrade >= 80) {
				letterGrade = "B";
			}
			else if (numericGrade >= 68) {
				letterGrade = "C";
			}
			else if (numericGrade >= 60) {
				letterGrade = "D";
			}
			System.out.println("Letter grade: "+letterGrade);
			System.out.println();
			
			System.out.print("Continue (y/n)? ");
			choice = sc.next();
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		System.out.println("Bye");
	}

}
