package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

import business.Item;

public class ItemManagerApp {
	private static List<Item> items;

	public static void main(String[] args) {
		// initialize items list and add some office items
		items = new ArrayList<>();
		items.add(new Item(1, "Laptop"));
		items.add(new Item(2, "Monitor"));
		items.add(new Item(3, "Monitor"));
		
		// implement CRUD functionality to allow a user to 
		// maintain the list of items:  Create, Read (List, Get by id),
		// Update, and Delete
		
		System.out.println("Welcome to the Item Manager App!");
		System.out.println();
		int command = 0;
		while (command != 9) {
			displayMenu();
			command = Console.getInt("Command: ");
			switch (command) {
			case 1:
				// list all items - loop through and print!
				System.out.println("Items:");
				System.out.println("=================");
				break;
			case 2:
				// get an item by id
				// - prompt user for id to retrieve
				// - loop through items and retrieve item
				//   that matches the id entered
				// - print the item
				System.out.println("Get an Item:");
				System.out.println("=================");
				break;
			case 3:
				// add an item
				// - prompt user for id and description
				// - create new instance of item
				// - add item to items list
				// - display success msg (Item added!)
				System.out.println("Add an Item:");
				System.out.println("=================");
				break;
			case 4:
				// update an item
				// - prompt user for id to retrieve
				// - loop through items and retrieve item
				//   that matches the id entered
				// - if item not found, print message
				// - if item found, prompt user for new description
				// - change the item description (hint: use setter)
				//   and display success msg
				System.out.println("Update an Item:");
				System.out.println("=================");
				break;
			case 5:
				// delete an item
				// - prompt user for id to retrieve
				// - loop through items and retrieve item
				//   that matches the id entered
				// - if item not found, print message
				// - if item found, delete it and display success msg
				System.out.println("Delete an Item:");
				System.out.println("=================");
				break;
			case 9:
				// exit
				break;
			default:
				System.out.println("Invalid command.  Try again.");
				break;
			}
			System.out.println();
		}
		System.out.println("Bye!");
	}
	
	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("==================");
		System.out.println("1 - List all items");
		System.out.println("2 - Get an item");
		System.out.println("3 - Add new item");
		System.out.println("4 - Update an item");
		System.out.println("5 - Delete an item");
		System.out.println("9 - Exit");
		System.out.println();
	}

}
