package ui;

import java.time.LocalDate;

import com.util.Console;

import business.Pet;
import db.PetDB;
import interfaces.DAO;

public class PetStoreApp {
	private static final String ITEM_NOT_FOUND = "No pet found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the Pet Manager - Text File Version");
		System.out.println();
		
		// creating instance of PetTextFile should create our file
		// on the first run of this app.
		DAO<Pet> petsDAO = new PetDB();
		
		int command = 0;
		while (command != 9) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
			switch (command) {
				case 1:
					// get all
					System.out.println("Get all Pets");
					System.out.println("=============================");
					for (Pet pet: petsDAO.getAll()) {
						System.out.println(pet);
					}
					break;
				case 2:
					// get by id
					System.out.println("Get Pet by ID");
					System.out.println("=============================");
					int id = Console.getInt("ID: ");
					Pet pet = petsDAO.get(id);
					if (pet != null) {
						System.out.println("Pet Found: "+pet);
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
				case 3:
					// add
					System.out.println("Add Pet");
					System.out.println("=============================");
					String t = Console.getLine("Type: ");
					String b = Console.getLine("Breed: ");
					String n = Console.getLine("Name: ");
					String bdStr = Console.getLine("Birth Date (YYYY-MM-DD): ");
					LocalDate bd = LocalDate.parse(bdStr);
					String g = Console.getLine("Gender: ");
					String d = Console.getLine("Disposition: ");
					boolean a = Console.getBoolean("Available? (y/n): ");
					if (petsDAO.add(new Pet(t,b,n,bd,g,d,a))) {
						System.out.println("Pet added!");
					}
					else {
						System.out.println("Error adding pet.");
					}
					break;
				case 4:
					// update
					System.out.println("Update Pet");
					System.out.println("====== not yet implemented ========");
//					id = Console.getInt("ID: ");
//					pet = petsDAO.get(id);
//					if (pet != null) {
//						String newDesc = Console.getLine("New description: ");
//						pet.setDescription(newDesc);
//						petsDAO.update(pet);
//						System.out.println("Pet updated!");
//					}
//					else {
//						System.out.println(ITEM_NOT_FOUND + id);
//					}					
					break;
				case 5:
					// delete
					System.out.println("Delete an Pet");
					System.out.println("=============================");
					id = Console.getInt("ID: ");
					pet = petsDAO.get(id);
					if (pet != null) {
						petsDAO.delete(pet);
						System.out.println("Pet Deleted: "+pet);
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
				case 9:
					// exit
					break;
				default:
					System.out.println("Invalid command!  Try again.");
					break;
			}
		}		
		
		
		
		
		
		
		System.out.println("Bye");

	}
	
	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("====================");
		System.out.println("1 - Get all pets");
		System.out.println("2 - Get a pet");
		System.out.println("3 - Add a pet");
		System.out.println("4 - Update a pet");
		System.out.println("5 - Delete a pet");
		System.out.println("9 - Exit");
		System.out.println();
	}
	

}
