package ui;

import java.time.LocalDate;
import java.util.List;

import com.util.Console;

import business.User;
import db.UserDB;
import interfaces.DAO;

public class PrsConsoleApp {
	private static final String ITEM_NOT_FOUND = "No record found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console App!");
		System.out.println();
		
		DAO<User> usersDAO = new UserDB();
		
		int command = 0;
		while (command != 99) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
			switch (command) {
				case 1:
					// get all
					System.out.println("Get all Users");
					System.out.println("=============================");
					for (User user: usersDAO.getAll()) {
						System.out.println(user);
					}
					break;
				case 2:
					// get by id
					System.out.println("Get User by ID");
					System.out.println("=============================");
					int id = Console.getInt("ID: ");
					User user = usersDAO.get(id);
					if (user != null) {
						System.out.println("User Found: "+user);
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
				case 3:
					// add
					System.out.println("Add User");
					System.out.println("=============================");
					String un = Console.getString("Username: ");
					String pw = Console.getString("Password: ");
					String fn = Console.getLine("First Name: ");
					String ln = Console.getLine("Last Name: ");
					String p = Console.getString("Phone Number: ");
					String e = Console.getString("Email: ");
					boolean rvw = Console.getBoolean("Reviewer (y/n): ");
					boolean adm = Console.getBoolean("Admin (y/n): ");
					if (usersDAO.add(new User(un, pw, fn, ln, p, e, rvw, adm))) {
						System.out.println("User added!");
					}
					else {
						System.out.println("Error adding user.");
					}
					break;
				case 4:
					// delete
					System.out.println("Delete an User");
					System.out.println("=============================");
					id = Console.getInt("ID: ");
					user = usersDAO.get(id);
					if (user != null) {
						usersDAO.delete(user);
						System.out.println("User Deleted: "+user);
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
		System.out.println("1  - Get all users");
		System.out.println("2  - Get a user");
		System.out.println("3  - Add a user");
		System.out.println("4  - Delete a user");
		System.out.println("99 - Exit");
		System.out.println();
	}
	

}
