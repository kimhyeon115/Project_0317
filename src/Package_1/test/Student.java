package Package_1.test;

public class Student extends Person implements Job {
	String grade;
	int studentId;
	public Student(String name, String address, String grade, int studentId) {
		super(name,address);
		this.grade = grade;
		this.studentId = studentId;
	}
	public void job() {
		System.out.println("지원:백엔드");
	}
	public void show() {
		System.out.println("이름:" + super.name);
		System.out.println("주소:" + super.address);
		System.out.println("학과:" + grade);
		System.out.println("학번:" + studentId);
		job();
	}
}
