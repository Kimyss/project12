package collection;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		ArrayList는 List의 자식이야
		
		list.add(10);		// 리스트에 값 추가메소드
		list.add(20);
		list.add(30);
		
		
//		리스트안에 저장된 값을 꺼내는 메소드		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("리스트 전체 요소: " + list);
		
//		list도 클래스인데? 주소값이 아닌 값을 반환을 하네?
//		toString가 재정의가 되었다.
		
		list.remove(2);
		System.out.println("리스트 요소 삭제 후: "+ list);
		
		int size = list.size();
		System.out.println("리스트 크기: " + size);

	}

}
