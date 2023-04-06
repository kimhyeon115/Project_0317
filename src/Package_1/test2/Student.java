package Package_1.test2;

public class Student extends Person {
	protected int grade;
	
	public Student(String name, int grade, int kor, int mat) {
		super(name, kor, mat);
		this.grade = grade;
	}
	public void showInfo() {
		System.out.println("이름:" + super.name);
		System.out.println("학번:" + grade);
		System.out.println("국어:" + super.kor);
		System.out.println("수학:" + super.mat);
		super.sumInfo();
	}
}
