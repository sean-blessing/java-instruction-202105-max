package business;

public class BasicCalculations {
	
	// accept an int and return the square of int
	public static int square(int nbr) {
		return nbr * nbr;
	}
	
	// accepts a String and returns an int
	//  representing the number of times the 
	// letter 'a' occurs (either lower or upper case)
	public static int countA(String str) {
		int aCount = 0;
		
		str = str.toLowerCase();
		
		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				aCount++;
			}
		}
		
		return aCount;
	}

}
