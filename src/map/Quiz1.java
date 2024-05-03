package map;

import java.util.Collection;
import java.util.HashMap;

/*
 * 문자타입 key, 문자열타입 value를 가지는 HashMap생성
 * 데이터 3개 추가
 * {'a', '사과'}, {'b','바나나'}, {'c','코코넛'}
 * 키값이 b인 요소의 값을 조회하세요
 * 바나나를 블루베리로 변경하세요
 * 사과를 삭제하세요
 * * */

public class Quiz1 {

	public static void main(String[] args) {
		
		HashMap<Character, String> fruitsMap= new HashMap<>();
		
		fruitsMap.put('a', "사과");
		fruitsMap.put('b', "바나나");
		fruitsMap.put('c', "코코넛");
		
		Collection<Character> keys = fruitsMap.keySet();
		System.out.println(keys);
		
		fruitsMap.replace('b', "블루베리");
		
		fruitsMap.remove('a');
		
		System.out.println(fruitsMap);
		
		
//		특정키 값이 존재하는지 확인하기!
		if(fruitsMap.containsKey('b')) {
			System.out.println("b라는 키 있어요");
		}else {
			System.out.println("b라는 키 없어요");
		}
				
		
	}

}
