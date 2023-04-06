package Package_2;
@FunctionalInterface // 붙여주면 인터페이스에 추상 메소드가 2개이상이면 오류출력 하기에 해당 조건을 체크 해 준다
interface MyFunction {//함수형 인터페이스를 만들때 추상 메소드는 1개만 있어야한다
	//public abstract int max(int a, int b);
	int max(int a, int b);//public abstract 생략(인터페이스 이기 때문)
	//public abstract int max2(int a, int b);
	//함수형 인터페이스 에는 추상 메서드가 한개만 있어야 한다 두개일시 오류간주
}
public class Ex77 {

	public static void main(String[] args) {
		//Object = (a, b) -> a > b ? a : b; //람다식, 익명객체
		MyFunction f = (a, b) -> a > b ? a : b; 
		int value = f.max(5, 3);
		System.out.println("value = " + value);
	}
}