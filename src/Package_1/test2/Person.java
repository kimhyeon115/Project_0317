package Package_1.test2;

public class Person {
	protected String name;
	protected int kor;
	protected int mat;
	
	public Person(String name, int kor, int mat) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
	}
	public void sumInfo() {
		int sum = 0;
		int avg = 0;
		sum = kor + mat;
		avg = sum / 2;
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
	}
}
