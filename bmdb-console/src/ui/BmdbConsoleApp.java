package ui;

import java.time.LocalDate;
import java.util.List;

import com.util.Console;

import business.Actor;
import business.Credit;
import business.Movie;
import db.ActorDB;
import db.CreditDB;
import db.MovieDB;
import interfaces.DAO;

public class BmdbConsoleApp {
	private static final String ITEM_NOT_FOUND = "No record found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the BMDB Console App!");
		System.out.println();
		
		DAO<Movie> moviesDAO = new MovieDB();
		DAO<Actor> actorsDAO = new ActorDB();
		CreditDB creditsDB = new CreditDB();
		
		int command = 0;
		while (command != 99) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
			switch (command) {
				case 1:
					// get all
					System.out.println("Get all Movies");
					System.out.println("=============================");
					for (Movie movie: moviesDAO.getAll()) {
						System.out.println(movie);
					}
					break;
				case 2:
					// get by id
					System.out.println("Get Movie by ID");
					System.out.println("=============================");
					int id = Console.getInt("ID: ");
					Movie movie = moviesDAO.get(id);
					if (movie != null) {
						System.out.println("Movie Found: "+movie);
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
				case 3:
					// add
					System.out.println("Add Movie");
					System.out.println("=============================");
					String title = Console.getLine("Title: ");
					int year = Console.getInt("Year: ");
					String rating = Console.getLine("Rating: ");
					String director = Console.getLine("Director: ");
					if (moviesDAO.add(new Movie(title, rating, year, director))) {
						System.out.println("Movie added!");
					}
					else {
						System.out.println("Error adding movie.");
					}
					break;
				case 4:
					// delete
					System.out.println("Delete an Movie");
					System.out.println("=============================");
					id = Console.getInt("ID: ");
					movie = moviesDAO.get(id);
					if (movie != null) {
						moviesDAO.delete(movie);
						System.out.println("Movie Deleted: "+movie);
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
				case 5:
					// get all
					System.out.println("Get all Actors");
					System.out.println("=============================");
					for (Actor actor: actorsDAO.getAll()) {
						System.out.println(actor);
					}
					break;
				case 6:
					// get by id
					System.out.println("Get Actor by ID");
					System.out.println("=============================");
					id = Console.getInt("ID: ");
					Actor actor = actorsDAO.get(id);
					if (actor != null) {
						System.out.println("Actor Found: "+actor);
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
				case 7:
					// add
					System.out.println("Add Actor");
					System.out.println("=============================");
					String fn = Console.getLine("First Name: ");
					String ln = Console.getLine("Last Name: ");
					String g = Console.getString("Gender: ");
					String bdStr = Console.getString("Birth Date (YYYY-MM-DD): ");
					LocalDate bd = LocalDate.parse(bdStr);
					if (actorsDAO.add(new Actor(fn, ln, g, bd))) {
						System.out.println("Actor added!");
					}
					else {
						System.out.println("Error adding actor.");
					}
					break;
				case 8:
					// delete
					System.out.println("Delete an Actor");
					System.out.println("=============================");
					id = Console.getInt("ID: ");
					actor = actorsDAO.get(id);
					if (actor != null) {
						actorsDAO.delete(actor);
						System.out.println("Actor Deleted: "+actor);
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
//				case 5:
//					// get movies by release year
//					moviesDB.getMoviesByYear(year)
//					break;
				case 9:
					// get all
					System.out.println("Get all Credits");
					System.out.println("=============================");
					for (Credit credit: creditsDB.getAll()) {
						System.out.println(credit.getCreditString());
						System.out.println("------------------------------------");
					}
					break;
				case 10:
					// get by id
					System.out.println("Get Credit by ID");
					System.out.println("=============================");
					id = Console.getInt("ID: ");
					Credit credit = creditsDB.get(id);
					if (credit != null) {
						System.out.println("Credit Found:\n"+credit.getCreditString());
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
				case 11:
					// get credits for a movie
					System.out.println("Get Credits by Movie:");
					System.out.println("=============================\n");
					id = Console.getInt("Movie ID: ");
					movie = moviesDAO.get(id);
					if (movie != null) {
						List<Credit> credits = creditsDB.getCreditsForMovie(movie);
						System.out.println("Credits for \""+movie.getTitle()+ 
								"("+movie.getYear()+")\":");
						System.out.println("==========================================");
						for (Credit c: credits) {
							System.out.println(c.getActor().getFullName()+" - "+c.getRole());
						}
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
				case 99:
					// exit
					break;
				default:
					System.out.println("Invalid command!  Try again.");
					break;
			}
			System.out.println();
		}		

		System.out.println("Bye");

	}
	
	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("====================");
		System.out.println("1  - Get all movies");
		System.out.println("2  - Get a movie");
		System.out.println("3  - Add a movie");
		System.out.println("4  - Delete a movie");
		System.out.println("-------------------");
		System.out.println("5  - Get all actors");
		System.out.println("6  - Get an actor");
		System.out.println("7  - Add an actor");
		System.out.println("8  - Delete an actor");
		System.out.println("-------------------");
		System.out.println("9  - Get all credits");
		System.out.println("10 - Get a credit");
		System.out.println("11 - Get credits for movie");
		System.out.println("99 - Exit");
		System.out.println();
	}
	

}
