package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

public class WizardInventoryAppPseudo {
	static List<String> items;

	public static void main(String[] args) {
		// initialize items
		items = new ArrayList<>();
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("wooden staff");
		
		System.out.println("Welcome to the Wizard Inventory App!");
		System.out.println();
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ");
			switch (command) {
			case "show":
				System.out.println("List all items:");
				System.out.println("====================");
				// loop thru all items and print
				break;
			case "grab":
				System.out.println("Add an item:");
				System.out.println("====================");
				// items size < 4?
				// - prompt user for item name
				// - add item to list
				// items size >= 4?
				// - error message
				break;
			case "edit":
				System.out.println("Edit an item:");
				System.out.println("====================");
				// prompt for item #
				// valid item ?
				// - prompt for new item name
				// - save item in same position in list
				// not valid item?
				// - error msg
				break;
			case "drop":
				System.out.println("Delete an item:");
				System.out.println("====================");
				// prompt for item #
				// valid item ?
				// - delete item from list
				// - display drop msg w/ item removed
				// not valid item?
				// - error msg
				break;
			case "exit":
				// exit
				break;
			default:
				System.out.println("Invalid command.  Try again.");
				break;
			}
			System.out.println();
		}
		System.out.println("Bye");

	}
	
	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("======================");
		System.out.println("show - Show all items");
		System.out.println("grab - Grab an item");
		System.out.println("edit - Edit an item");
		System.out.println("drop - Drop an item");
		System.out.println("exit - Exit app");
		System.out.println();
	}

	
	
	
	
	
	
	
	
	
	
}
