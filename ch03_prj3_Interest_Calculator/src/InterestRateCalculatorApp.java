import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestRateCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Rate Calculator");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Loan Amount: ");
			BigDecimal loanAmt = sc.nextBigDecimal();
			System.out.print("Interest Rate: ");
			BigDecimal intRate = sc.nextBigDecimal();
			
//			BigDecimal interest = loanAmt.multiply(intRate).
//					setScale(2, RoundingMode.HALF_UP);
			
			BigDecimal interest = loanAmt.multiply(intRate);
			interest = interest.setScale(2, RoundingMode.HALF_UP);
			
			NumberFormat curr = NumberFormat.getCurrencyInstance();
			NumberFormat pct = NumberFormat.getPercentInstance();
			pct.setMaximumFractionDigits(3);
			
			System.out.println("Loan Amount:    "+curr.format(loanAmt));
			System.out.println("Interest Rate:  "+pct.format(intRate));
			System.out.println("Interest:       "+curr.format(interest));
			
			
			
			System.out.print("Continue(y/n)? ");
			choice = sc.next();
		}
		
		
		
		
		sc.close();
		System.out.println("Bye");

	}

}
