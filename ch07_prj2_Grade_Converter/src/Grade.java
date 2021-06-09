
public class Grade {
	
	private int numGrade;

	public Grade() {
		super();
		numGrade = 0;
	}

	public Grade(int numGrade) {
		super();
		this.numGrade = numGrade;
	}
	
	public String getLetter() {
		String letterGrade = "F";
		
		if (numGrade >= 88)
			letterGrade = "A";
		else if (numGrade >= 80)
			letterGrade = "B";
		else if (numGrade >= 67)
			letterGrade = "C";
		else if (numGrade >= 60)
			letterGrade = "D";
		
		return letterGrade;
	}
	
	

}
