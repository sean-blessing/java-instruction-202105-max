
public class AnimalCounterApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Welcome to the Animal Counter");
		
		System.out.println("Counting Alligators...");
		Alligator a = new Alligator();
		
		count(a, 3);
		System.out.println("Counting Sheep...");
		
		Sheep s = new Sheep("Blackie");
		
		count(s, 2);
		
		
		Sheep s2 = (Sheep)s.clone();
		s2.setName("Dolly");
		count(s2,3);
		
		count(s,1);

		System.out.println("Bye");
	}
	
	public static void count(Countable c, int maxCount) {
		c.resetCount();
		while (c.getCount() <= maxCount) {
			System.out.println(c.getCountString());
			c.incrementCount();
		}
		System.out.println();
	}

}
