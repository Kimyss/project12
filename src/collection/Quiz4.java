package collection;
/*
 * 정수타입의 HashSet 생성하세요 
 * set에 숫자 3개를 추가하세요
 * set의 크기를 출력하세요
 * Iterator이용하여 set의 요소를 하나씩 출력하세요
 * 람다식 for문 이용하여 set의 요소를 하나씩 출력하세요
 * */

import java.util.HashSet;
import java.util.Iterator;

public class Quiz4 {

	public static void main(String[] args) {
		
//		hashSet 기초타입 불가 클래스타입만 가능 그래서 wrapper
		
		HashSet<Integer> intSet = new HashSet<>();
		
		intSet.add(25);
		intSet.add(50);
		intSet.add(75);
		
		System.out.println("set의 크기: " + intSet.size());
		System.out.println();
		
		Iterator<Integer> ir = intSet.iterator();
		
		while(ir.hasNext()) {		//조건문 오면된다. 사실 boolean값이 와도 되요
			Integer number = ir.next();
			System.out.println(number);
		}
		
		System.out.println();
		
		for(int num : intSet) {
			System.out.println(num);
		}
		
		
		

	}

}
