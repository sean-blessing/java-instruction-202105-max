package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

import business.Item;

public class ItemManagerApp {
	private static List<Item> items;
	private static final String ITEM_NOT_FOUND_MSG = "No item found for number: ";

	public static void main(String[] args) {
		// initialize items list and add some office items
		items = new ArrayList<>();
		items.add(new Item(1, "Laptop"));
		items.add(new Item(2, "Monitor"));
		items.add(new Item(3, "Mouse"));
		
		// implement CRUD functionality to allow a user to 
		// maintain the list of items:  Create, Read (List, Get by number),
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
				for (Item i: items) {
					System.out.println(i);
				}
				break;
			case 2:
				// get an item by number
				// - prompt user for number to retrieve
				int nbr = Console.getInt("Item number to retrieve: ");
				Item item = getItem(nbr);
				System.out.println("Get an Item:");
				System.out.println("=================");
				if (item!=null) {
					System.out.println(item);
				}
				else {
					System.out.println(ITEM_NOT_FOUND_MSG + nbr);
				}
				break;
			case 3:
				// add an item
				// - prompt user for number and description
				// - create new instance of item
				// - add item to items list
				// - display success msg (Item added!)
				System.out.println("Add an Item:");
				System.out.println("=================");
				nbr = Console.getInt("Item number: ");
				String desc = Console.getLine("Item description: ");
				items.add(new Item(nbr, desc));
				System.out.println("Item added!");
				break;
			case 4:
				// update an item
				// - prompt user for number to retrieve
				// - loop through items and retrieve item
				//   that matches the number entered
				// - if item not found, print message
				// - if item found, prompt user for new description
				// - change the item description (hint: use setter)
				//   and display success msg
				System.out.println("Update an Item:");
				System.out.println("=================");
				nbr = Console.getInt("Item number to retrieve: ");
				item = getItem(nbr);
				if (item!=null) {
					item.setDescription(Console.getLine("New description: "));
					System.out.println("Item updated!");
				}
				else {
					System.out.println(ITEM_NOT_FOUND_MSG + nbr);
				}
				break;
			case 5:
				// delete an item
				// - prompt user for number to retrieve
				// - loop through items and retrieve item
				//   that matches the number entered
				// - if item not found, print message
				// - if item found, delete it and display success msg
				System.out.println("Delete an Item:");
				System.out.println("=================");
				nbr = Console.getInt("Item number to delete: ");
				item = getItem(nbr);
				if (item!=null) {
					items.remove(item);
					System.out.println("Item deleted: "+item);
				}
				else {
					System.out.println(ITEM_NOT_FOUND_MSG + nbr);
				}
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
	
	private static Item getItem(int itemNbr) {
		Item foundItem = null;
		// - loop through items and retrieve item
		//   that matches the number entered
		// - print the item
		for (Item item: items) {
			if (item.getNumber() == itemNbr) {
				foundItem = item;
			}
		}
		return foundItem;
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
