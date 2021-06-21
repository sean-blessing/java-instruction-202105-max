package ui;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator app!");
		
		int n1 = 5;
		int n2 = 8;
		System.out.println("Add 2 numbers");
		System.out.println(n1 + " + " + n2 + " = "+add2(n1,n2));
		
		System.out.println("Add 3 numbers");
		int n3 = 22;
		System.out.println(n1 + " + " + n2 + " + "+ n3 + " = "+add3(n1,n2,n3));
		
		
		System.out.println("Add 4 numbers");
		// https://www.baeldung.com/java-varargs
		int n4 = 11;
		System.out.println(n1 + " + " + n2 + " + "+ n3 + " + "+ n4 +
				" = "+add(n1,n2,n3, n4));
		
		System.out.println("big sum = "+ add(2,4,6,8,10,12,14,16,18,20));
		
		System.out.println("Bye");

	}
	
	private static int add2(int n1, int n2) {
		return n1 + n2;
	}
	
	private static int add3(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	private static int add(int... numbers) {
		int sum = 0;
		
		for (int i: numbers) {
			sum += i;
		}
		
		return sum;
	}

}
