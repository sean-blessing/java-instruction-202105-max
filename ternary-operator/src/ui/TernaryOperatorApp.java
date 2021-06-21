package ui;

public class TernaryOperatorApp {

	public static void main(String[] args) {
		// https://www.baeldung.com/java-ternary-operator
		int num = 4;
		System.out.println("Number is "+num);
		String msg1 = "";
		if(num > 10) {
		    msg1 = "Number is greater than 10";
		}
		else {
		    msg1 = "Number is less than or equal to 10";
		}
		
		System.out.println(msg1);
		
		System.out.println("Ternary version:");
		String msg2 = num > 10 ? "Nbr > 10" : "Nbr <= 10";
		System.out.println(msg2);
		
		System.out.println("nested ternary...");
		String msg3 = num > 10 ? "Number is greater than 10" 
				  : (num > 5 ? "Number is greater than 5" : "Number is less than equal to 5");
		System.out.println(msg3);
		
		System.out.println("ternary, call a method");
		String msg4 = (num % 2 == 1) ? "Number is odd, times 2 = " +timesTwo(num) 
				  : "Number is even";
		System.out.println(msg4);
	}
	
	private static int timesTwo(int i) {
		// print i * 2
		return (i * 2);
	}

}
