import java.util.Scanner;

public class StoplightApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the stoplight app!");
		
		System.out.println();
		System.out.println("Answer a few questions to determine\n"
				+ "what action you should take (Proceed vs Stop).\n");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// proceed will dictate final message:  Proceed! or Stop!
			boolean proceed = false;
			System.out.print("Light Color (r/y/g)? ");
			String lightColor = sc.next();
			if (lightColor.equalsIgnoreCase("r")) {
				System.out.print("Right turn (true / false)?");
				boolean rightTurn = sc.nextBoolean();
				if (rightTurn) {
					System.out.print("Obstacle? (true/false)");
					boolean obstacle = sc.nextBoolean();
					if (!obstacle) {
						proceed = true;
					}
				}
			}
			else if (lightColor.equalsIgnoreCase("y")) {
				System.out.print("Yards from light? ");
				int yards = sc.nextInt();
				if (yards < 30) {
					System.out.print("Obstacle? (true/false)");
					boolean obstacle = sc.nextBoolean();
					if (!obstacle) {
						proceed = true;
					}					
				}
			}
			else if (lightColor.equalsIgnoreCase("g")) {
				System.out.print("Obstacle? (true/false)");
				boolean obstacle = sc.nextBoolean();
				if (!obstacle) {
					proceed = true;
				}					
			}
			else {
				System.out.println("Invalid light color.  Try again.");
				continue;
			}
			
			if (proceed) {
				System.out.println("Proceed!");
			}
			else {
				System.out.println("Stop!");
			}
			
			System.out.print("Again (y/n)?");
			choice = sc.next();
		}
		
		
		
		
		sc.close();
		System.out.println("Bye");

	}

}
