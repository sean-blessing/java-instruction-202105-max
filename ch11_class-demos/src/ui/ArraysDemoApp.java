package ui;

import java.util.Arrays;

import business.Item;

public class ArraysDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		
		System.out.println("main method args: ");
		for (String arg: args) {
			System.out.println(arg);
		}
		
		//p. 355 - basic arrays
		double[] prices = new double[4];
		prices[0] = 11.12;
		prices[1] = 2.35;
		prices[2] = 4.7;
		prices[3] = 20.22;
		
		// p. 359 compute average price
		double total = 0;
		for (int i=0; i < prices.length; i++) {
			total += prices[i];
			System.out.println(i + ": " + prices[i]);
		}
		System.out.println("prices total: "+total);
		System.out.println("prices avg:   "+total/prices.length);
		
		//p. 360 (jumping ahead) enhanced for / foreach loop
		System.out.println("enhanced for loop...");
		for (double p: prices) {
			System.out.println(p);
		}
		
		String[] names = {"Sean", "Dylan", "Linda", "Michelle", "Seth",
				"Nick", "Matt"};
		
		for (String name: names) {
			System.out.println(name);
		}
		
		// an array of items
		Item i1 = new Item(5, "headphones");
		Item i2 = new Item(2, "amplifier");
		Item i3 = new Item(4, "speakers");
		Item i4 = new Item(1, "turntable");
		Item i5 = new Item(3, "microphone");
		
		Item[] items = {i1, i2, i3, i4, i5};
		
		for (Item item: items) {
			System.out.println(item);
		}
		
		// p. 362 - 363 Arrays Class
		// is 2.35 in the array of prices?
		// what position?
		System.out.println(Arrays.binarySearch(prices, 2.35));
		
		// sorting
		for (String n: names) {
			System.out.println(n);
		}
		System.out.println("sort the names...");
		Arrays.sort(names);
		
		for (String n: names) {
			System.out.println(n);
		}
		
		for (Item item: items) {
			System.out.println(item);
		}
		System.out.println("Sort the items...");
		Arrays.sort(items);
		for (Item item: items) {
			System.out.println(item);
		}
		
		
		
		System.out.println("Bye");

	}

}
