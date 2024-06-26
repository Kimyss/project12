package collection;

import java.util.ArrayList;

/*
 * 1)
 * Character타입의 ArrayList 생성하세요
 * 문자 3개 추가하세요 ('A','B','C')
 * 
 * 리스트의 요소를 하나씩 출력하세요
 * 리스트에서 두번째 문자B를 삭제하세요
 * 리스트의 크기를 출력하세요
 * 
 * 2)리스트에 'A'라는 문자가 있는지 확인하고,
 * 있다면 리스트에서 삭제하세요
 * */

public class Quiz1 {

	public static void main(String[] args) {
		
ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A'); //리스트 추가
		list.add('B');
		list.add('C');
		
		System.out.println(list.get(0)); //리스트 요소 하나씩 출력
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(1);	//리스트 요소 삭제
		
		System.out.println("2번째 요소 삭제: " + list); //리스트 전체 출력
		System.out.println("리스트 크기: " + list.size());
		
		
		
	}

}
