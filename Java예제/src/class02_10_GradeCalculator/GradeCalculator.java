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
		System.out.printf("���� �б� ����: %.1f (�� %d����)\n", this.previousTot, this.previousCredit);
		System.out.printf("�̹� �б� ����: %.10f (�� %d����)\n", this.a, this.currentCredit);
		System.out.printf("��ü ���� ����: %.10f (�� %d����)", this.totalScore, this.totalCredit);
	}
}
