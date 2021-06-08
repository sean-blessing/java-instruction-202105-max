
public class ConsoleDemoApp {

	public static void main(String[] args) {
		String code = Console.getString("Code?");
		String desc = Console.getString("Description?");
		double price = Console.getDouble("Price?", 0, 100000);
		
		Product p = new Product(code, desc, price);
		

	}

}
