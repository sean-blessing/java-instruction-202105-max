
public class ConsoleDemoApp {

	public static void main(String[] args) {
		String name = Console.getString("name?");
		int nbr = Console.getInt("nbr?");
		double price = Console.getDouble("Price?", 0, 100000);
		

	}

}
