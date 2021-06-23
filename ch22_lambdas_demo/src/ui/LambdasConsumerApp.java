package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import business.Contact;
import interfaces.TestContact;

public class LambdasConsumerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to lambdas - Predicates!");
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All Contacts:");
		printContacts(contacts);
		
		System.out.println("========================");
		System.out.println("contacts no phone - lambda");
		List<Contact> contactsNoPhone = filterContacts(contacts, 
									c -> c.getPhone() == null);
		printContacts(contactsNoPhone);
		
		System.out.println("========================");
		System.out.println("contacts no email - lambda");
		List<Contact> contactsNoEmail = filterContacts(contacts,
									c -> c.getEmail()==null);
		printContacts(contactsNoEmail);

		System.out.println("========================");
		System.out.println("contacts no email & no phone - lambda");
		List<Contact> contactsNoEmailNoPhone = filterContacts(contacts,
									c -> c.getPhone()==null && c.getEmail()==null);
		printContacts(contactsNoEmailNoPhone);

		System.out.println("Bye");

	}
	
	public static void printContacts(List<Contact> contacts) {
		for (Contact c: contacts) {
			System.out.println(c);
		}
	}
	
	/*
	 * Our lambda method
	 */
	public static List<Contact> filterContacts(List<Contact> contacts,
										Predicate<Contact> condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}

}
