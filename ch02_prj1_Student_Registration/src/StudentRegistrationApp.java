import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Student Registration App");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		// Prompt for Input
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		System.out.print("Enter last name: ");
		String lastName = sc.next();
		System.out.print("Enter year of birth: ");
		int birthYear = sc.nextInt();
		
		System.out.println();
		
		// Biz logic
		String fullName = firstName + " " + lastName;
		String tempPwd = firstName + "*" + birthYear;
		
		System.out.println("Welcome "+fullName+"!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: "+tempPwd);
		
		sc.close();
		System.out.println("Bye");

	}

}
