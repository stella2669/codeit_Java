package class02_10_GradeCalculator;

public class GradeCalculator {
	private String userName;
	private double previousTot;
	private double currentTot;
	private double a;
	private double totalScore;
	
	
	private int previousCredit;
	private int currentCredit;
	private int totalCredit;
	
	
	
	public GradeCalculator(String userName, double previousScore, int previousCredit) {
		 this.userName = userName;
		 this.previousTot = previousScore;
		 this.previousCredit = previousCredit;
	}
	
	void addCourse(Course course){
		this.currentCredit += course.getCredit();
		this.currentTot += course.getTot();
		this.a = this.currentTot/this.currentCredit;
		this.totalCredit = this.currentCredit + this.previousCredit;
		this.totalScore = (this.currentTot + this.previousTot * previousCredit) / this.totalCredit;
		
		
	}
	
	void print() {
		System.out.printf("직전 학기 성적: %.1f (총 %d학점)\n", this.previousTot, this.previousCredit);
		System.out.printf("이번 학기 성적: %.10f (총 %d학점)\n", this.a, this.currentCredit);
		System.out.printf("전체 예상 학점: %.10f (총 %d학점)", this.totalScore, this.totalCredit);
	}
}
