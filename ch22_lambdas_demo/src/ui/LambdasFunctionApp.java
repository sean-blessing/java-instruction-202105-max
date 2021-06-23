package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import business.Contact;
import interfaces.TestContact;

public class LambdasFunctionApp {

	public static void main(String[] args) {
		System.out.println("Welcome to lambdas - Predicates!");
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All Contacts:");
		printContacts(contacts);
		
		System.out.println("========================");
		System.out.println("Create list of names + phone #s:");
		List<String> contactPhoneNumbers = transformContacts(contacts, 
									c -> {
										String phone = (c.getPhone()==null) ? "n/a" : c.getPhone();
										return c.getName() + ": " + phone;
									});
		for (String s: contactPhoneNumbers) {
			System.out.println(s);
		}
		


		System.out.println("Bye");

	}
	
	public static void printContacts(List<Contact> contacts) {
		for (Contact c: contacts) {
			System.out.println(c);
		}
	}
	
	// p.713
	// run function on each object and return a string
	public static List<String> transformContacts(List<Contact> contacts,
												Function<Contact, String> function) {
		List<String> strings = new ArrayList<>();
		for (Contact c: contacts) {
			strings.add(function.apply(c));
		}
		return strings;
	}
	
	
	
	
	
	
	
	
	
	
	

}
