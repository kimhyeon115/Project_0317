package Package_1.generics;

import java.util.ArrayList;

public class GenericsTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //제네릭스 Integer(정수) 타입 전용으로 제한
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
	}

}
