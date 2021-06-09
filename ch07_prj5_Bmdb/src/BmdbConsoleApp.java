
public class BmdbConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to BMDB");
		
		int id = Console.getInt("Movie ID:  ");
		String title = Console.getLine("Movie Title:  ");
		int year = Console.getInt("Movie Year:  ");
		String rating = Console.getString("Movie Rating:  ");
		String director = Console.getLine("Movie Director:  ");
				
		Movie m1 = new Movie(id, title, year, rating, director);
		
		// print movie summary
		System.out.println("Movie Summary:");
		System.out.println("=====================");
		System.out.println(m1);
		System.out.println("Bye");

	}

}
