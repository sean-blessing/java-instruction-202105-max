package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import business.Contact;
import interfaces.TestContact;

public class LambdasPredicateApp {

	public static void main(String[] args) {
		System.out.println("Welcome to lambdas - Predicates!");
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All Contacts:");
		printContacts(contacts);
		
		System.out.println("========================");
		System.out.println("print the names of the contacts:");
		processContacts(contacts, c -> System.out.println(c.getName()));
		
		System.out.println("========================");
		System.out.println("change names to upper case:");
		processContacts(contacts, c -> c.setName(c.getName().toUpperCase()));
		processContacts(contacts, c -> System.out.println(c.getName()));
		
		System.out.println("Bye");

	}
	
	public static void processContacts(List<Contact> contacts,
									Consumer<Contact> consumer) {
		for (Contact c: contacts) {
			consumer.accept(c);
		}
	}
	
	public static void printContacts(List<Contact> contacts) {
		for (Contact c: contacts) {
			System.out.println(c);
		}
	}
	


}
