package ui;

import com.util.Console;

import business.BasicCalculations;

public class CalculationsApp {

	public static void main(String[] args) {
		int nbr = Console.getInt("enter a whole nbr: ");
		System.out.println("Square: "+BasicCalculations.square(nbr));
		
		String line = Console.getLine("Enter a sentence: ");
		System.out.println("# of a's: "+BasicCalculations.countA(line));

	}

}
