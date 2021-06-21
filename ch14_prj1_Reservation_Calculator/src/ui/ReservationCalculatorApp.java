package ui;

import java.time.LocalDate;

import com.util.Console;

import business.Reservation;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Reservation Calculator App!");
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter arrival and depature info:");
			System.out.println("================================");
			int arrMonth = Console.getInt("Enter the arrival month (1-12): ", 1, 12);
			int arrDay = Console.getInt("Enter the arrival day (1-31): ", 1, 31);
			int arrYear = Console.getInt("Enter the arrival year (YYYY): ");
			System.out.println();
			
			int depMonth = Console.getInt("Enter the departure month (1-12): ", 1, 12);
			int depDay = Console.getInt("Enter the departure day (1-31): ", 1, 31);
			int depYear = Console.getInt("Enter the departure year (YYYY): ");
			System.out.println();
			
			LocalDate arrivalDate = LocalDate.of(arrYear, arrMonth, arrDay);
			LocalDate departureDate = LocalDate.of(depYear, depMonth, depDay);
			
			Reservation res = new Reservation(arrivalDate, departureDate);

			System.out.println("Arrival Date: "+res.getArrivalDateFormatted());
			System.out.println("Departure Date: "+ res.getDepartureDateFormatted());
			System.out.println("Price/Night: "+ res.getPricePerNightFormatted());
			System.out.println("Total Price: "+ res.getTotalPriceFormatted());
			System.out.println();
			
			choice = Console.getString("Continue (y/n)? ", "y", "n");
			System.out.println();
		}
		
		
		
		System.out.println("Bye");
	}

}
