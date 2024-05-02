package generic;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
//		숫자를 저장하는 리스트 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();	//리스트의 자료형
		list1.add(10);		//int타입의 값만 저장가능
		Integer i = list1.get(0);	//값을 꺼낼 때 형변환 필요 XX
		System.out.println(i);
				
		
//		문자열 사용하는 리스트생성
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");
		String str = list2.get(0);
		System.out.println(str);

	}

}
