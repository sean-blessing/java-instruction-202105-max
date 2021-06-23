package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import business.Contact;
import interfaces.TestContact;

public class StreamsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to lambdas!");
		
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All Contacts:");
		printContacts(contacts);
		
		System.out.println("========================");
		System.out.println("print names of contacts with no phone - streams");
		contacts.stream()
				.filter(c -> c.getPhone()==null)
				.forEach(c -> System.out.println(c.getName()));
		
		System.out.println("========================");
		System.out.println("create a new list of contacts w/ no phone #");
		List<Contact> contactsNoPhone = contacts.stream()
				.filter(c -> c.getPhone() == null)
				.collect(Collectors.toList());
		printContacts(contactsNoPhone);
		
		
		//p. 719
		System.out.println("========================");
		List<String> contactNames = contacts.stream()
				.map(c -> c.getName())
				.collect(Collectors.toList());
		contactNames.stream().forEach(str -> System.out.println(str));
		
		// double colon version
		System.out.println("========================");
		contactNames = contacts.stream().map(Contact::getName)
									.collect(Collectors.toList());
		contactNames.stream().forEach(System.out::println);
		System.out.println("Bye");

	}
	
	public static void printContacts(List<Contact> contacts) {
		for (Contact c: contacts) {
			System.out.println(c);
		}
	}

}
