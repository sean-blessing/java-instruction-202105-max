package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		System.out.println("Date Time App!");
		
		//p.443
		LocalDateTime currentTimestamp = LocalDateTime.now();
		LocalDate currentDate = LocalDate.now();
		System.out.println("current datetime: "+currentTimestamp);
		System.out.println("current date: "+currentDate);
		
		LocalDate halloween = LocalDate.of(2021, 10, 31);
		LocalDate christmas = LocalDate.of(2021, Month.DECEMBER, 25);
		
		System.out.println("Halloween: "+halloween);
		System.out.println("Christmas: "+christmas);
		
		LocalDate july4th = LocalDate.parse("2021-07-04");
		System.out.println("July 4th: "+july4th);
		LocalDateTime laborDay = LocalDateTime.parse("2021-09-06T00:00");
		System.out.println("Labor Day = "+laborDay);
		
		//p. 445
		System.out.println("Labor Day 2021");
		System.out.println("getYear(): "+currentTimestamp.getYear());
		System.out.println("getMonth(): "+currentTimestamp.getMonth());
		System.out.println("getMonthValue(): "+currentTimestamp.getMonthValue());
		System.out.println("getDayOfMonth(): "+currentTimestamp.getDayOfMonth());
		System.out.println("getDayOfYear(): "+currentTimestamp.getDayOfYear());
		System.out.println("getDayOfWeek(): "+currentTimestamp.getDayOfWeek());
		System.out.println("getHour(): "+currentTimestamp.getHour());
		System.out.println("getMinute(): "+currentTimestamp.getMinute());
		System.out.println("getSecond(): "+currentTimestamp.getSecond());
		System.out.println("getNano(): "+currentTimestamp.getNano());
		
		//p. 447
		if (currentTimestamp.isBefore(laborDay)) {
			System.out.println("today is before labor day");
		}
		if (christmas.isAfter(halloween)) {
			System.out.println("duh... xmas is after halloween!");
		}
		
		System.out.println(halloween.compareTo(christmas));
		System.out.println(christmas.compareTo(july4th));
		
		// p. 449
		// New date 1 month from today
		LocalDateTime monthLaterThanToday = currentTimestamp.withMonth(7);
		System.out.println(monthLaterThanToday);
		
		// p. 451
		// 10 weeks from today
		LocalDateTime tenWeeks = currentTimestamp.plus(10, ChronoUnit.WEEKS);
		System.out.println(tenWeeks);
		
		// 2 weeks from today
		LocalDateTime twoWeeks = currentTimestamp.plusWeeks(2);
		System.out.println(twoWeeks);
		
		long daysUntilHalloween = currentDate.until(halloween, ChronoUnit.DAYS);
		System.out.println("days until halloween: "+daysUntilHalloween);
		long daysBetween = ChronoUnit.DAYS.between(july4th, laborDay);
		System.out.println("days between: "+daysBetween);
		long monthsBetween = ChronoUnit.MONTHS.between(july4th, laborDay);
		System.out.println("months between: "+monthsBetween);
		
		// p.453
		DateTimeFormatter formatter = DateTimeFormatter.
				ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM);
		System.out.println(formatter.format(currentTimestamp));
		System.out.println("Bye");
	}

}
