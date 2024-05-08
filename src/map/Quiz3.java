package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
 *String형 키, float형 value를 가지는 HashMap객체를 생성
 *다음과같이 데이터 3개 추가
 *{국어,80.0},{수학,90.0},{영어,100.0}
 *map을 순회하여 모든과목의 이름 출력하세요 {국어, 수학, 영어}
 *map을 순회하여 모든 과목의 점수를 출력하세요 {80.0, 90.0, 100.0} 
 * */

public class Quiz3 {

	public static void main(String[] args) {

		HashMap<String, Float> subjectMap = new HashMap<>();

//		<제네릭타입> => <key, value> 키는 밸류를 위한 보조적인 역할이라고 생각해
//		Map 기초타입X 래퍼클래스사용요망, 대문자로 써야해

		subjectMap.put("국어", 80.0f);
		subjectMap.put("수학", 90.0f);
		subjectMap.put("영어", 100.0f);

		System.out.println(subjectMap.keySet());
		System.out.println(subjectMap);
		System.out.println();
		
		// map 순회
		Set<String> keySet = subjectMap.keySet();

		System.out.println(keySet);
		for (String key1 : keySet) {
			System.out.println(subjectMap.get(key1));
		}

		System.out.println();
		
		Collection<Float> values = subjectMap.values();
		System.out.println(values);
		System.out.println();
		
		for (float value : values) {
			System.out.println(value);
		}

	}

}
