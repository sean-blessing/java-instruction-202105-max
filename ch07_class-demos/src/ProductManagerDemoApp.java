
public class ProductManagerDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager App");
		
		//p. 225
		// create Products
		// use empty constructor
		Product p1 = new Product();
		p1.setCode("java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(57.5);
		
		//fully loaded constructor
		Product p2 = new Product("andr", "Murach's Android Programming", 59.50);
		
//		p1.staticVariable = "hello";
//		p2.staticVariable = "there";
		

		Product p3 = new Product("andr", "Murach's Android Programming", 59.50);
		Product p4 = p1;
		p4.setPrice(111.11);
//		System.out.println("======== p1 ========");
//		printProduct(p1);
//		System.out.println("======== p2 ========");
//		printProduct(p2);
//		System.out.println("======== p3 ========");
//		printProduct(p3);
//		System.out.println("======== p4 ========");
//		printProduct(p4);
		
		if (p2 == p3) {
			System.out.println("same!");
		}
		
		System.out.println(p1);
		System.out.println();
		System.out.println("Bye");
	}
	
	private static void printProduct(Product p) {
		System.out.println("Product Detail:");
		System.out.println("code:  "+p.getCode());
		System.out.println("desc:  "+p.getDescription());
		System.out.println("price: "+p.getPrice());
		//System.out.println("staticVariable:  "+p.staticVariable);
	}

}
