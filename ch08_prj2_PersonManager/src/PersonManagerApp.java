import com.util.Console;

public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String type = Console.getString("Create customer or"
					+ " employee (c/e)? ", "c", "e");
			Person p;
			String firstName = Console.getString("First Name:  ");
			String lastName = Console.getString("Last Name:  ");
			if (type.equalsIgnoreCase("c")) {
				String customerNumber = Console.getString("Customer Number:  ");
				Customer c = new Customer(firstName, lastName, customerNumber);
				p = c;
			}
			else {
				String ssn = Console.getString("SSN:  ");
				Employee e = new Employee(firstName, lastName, ssn);
				p = e;
			}
			
			System.out.println();
			Class c = p.getClass();
			String className = c.getName();
			System.out.println("You entered a new "+className+":");
			System.out.println(p);
			
			
			choice = Console.getString("Continue (y/n)? ", "y", "n");
		}
		
		
		
		System.out.println("Bye");

	}

}
