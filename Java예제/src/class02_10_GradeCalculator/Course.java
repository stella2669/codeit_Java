package class02_10_GradeCalculator;

public class Course {
	private String className;
	static int CREDIT_MAJOR = 3;
	static int CREDIT_GENERAL = 2;
	private int credit;
	private double score;
	private double tot;
	
	public Course(String className, int credit, String grade) {
		this.className = className;
		this.credit = credit;
		gradeToScore(grade);
		this.tot = this.score * credit;
	}
	
	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getTot() {
		return tot;
	}

	public void setTot(double tot) {
		this.tot = tot;
	}

	public double gradeToScore(String grade) {
		switch(grade) {
		case "A+":
			this.score = 4.5;
			break;
		case "A":
			this.score = 4.0;
			break;
		case "B+":
			this.score = 3.5;
			break;
		case "B":
			this.score = 3.0;
			break;
		case "C+":
			this.score = 2.5;
			break;
		case "C":
			this.score = 2.0;
			break;
		case "D+":
			this.score = 1.5;
			break;
		case "D":
			this.score = 1.0;
			break;
		case "F":
			this.score = 0.0;
		}
		return this.score;
	}
	
	
}
