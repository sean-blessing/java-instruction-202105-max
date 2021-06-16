package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

public class WizardInventoryApp {
	
	static List<String> items;
	static {
		// initialize items
		items = new ArrayList<>();
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");
	}

	public static void main(String[] args) {

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
				listItems();
				break;
			case "grab":
				System.out.println("Add an item:");
				System.out.println("====================");
				addItem();
				break;
			case "edit":
				System.out.println("Edit an item:");
				System.out.println("====================");
				int itemNbr = Console.getInt("Number: ");
				editItem(itemNbr);
				break;
			case "drop":
				System.out.println("Delete an item:");
				System.out.println("====================");
				itemNbr = Console.getInt("Number: ");
				dropItem(itemNbr);
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

	private static void dropItem(int itemNbr) {
		if (validateItemNumber(itemNbr)) {
			
			String deletedItem = items.remove(itemNbr-1);
			System.out.println(deletedItem+" was dropped.");
		} else {
			System.out.println("Invalid item number.");
		}
	}

	private static void editItem(int itemNbr) {
		if (validateItemNumber(itemNbr)) {
			String name = Console.getLine("Updated name: ");
			items.set((itemNbr - 1), name);
			System.out.println("Item number " + itemNbr + " was updated.");
		} else {
			System.out.println("Invalid item number.");
		}
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

	private static void listItems() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println((i + 1) + ". " + items.get(i));
		}
	}

	private static void addItem() {
		if (items.size() < 4) {
			String name = Console.getLine("Name: ");
			items.add(name);
			System.out.println(name + " was added.");
		} else {
			System.out.println("You can't carry anymore items.  Drop something first.");
		}
	}

	private static boolean validateItemNumber(int itemNbr) {
		boolean found = false;
		if (itemNbr > 0 && itemNbr <= items.size()) {
			found = true;
		}
		return found;
	}

}
