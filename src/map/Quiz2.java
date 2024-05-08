package map;
/*
 * String형 key, int형 value 가지는 HashMap 객체 생성  
 * 데이터 3개 추가
 * {"국어",80}, {"수학", 90}, {"영어", 100}
 * 국어 50 수학 60 영어 70 으로 수정
 * 영어점수삭제
 * map 요소 하나씩 출력 	** 순회 할거면 람다식 혹은 이터레이터 ㄱㄱ 키셋으로 돌려
 * map 모든요소 한번에출력
 * */

import java.util.HashMap;

public class Quiz2 {
	public static void main(String[] args) {
		
		HashMap<String, Integer> subjectMap = new HashMap<>();
		
		subjectMap.put("국어", 80);
		subjectMap.put("수학", 90);
		subjectMap.put("영어", 100);
		
		subjectMap.replace("국어", 50);
		subjectMap.replace("수학", 60);
		subjectMap.replace("영어", 70);
		
		subjectMap.remove("영어");
		
		subjectMap.get("국어");
		subjectMap.get("수학");
		
		System.out.println(subjectMap);
		System.out.println(subjectMap.size());
		
		
	}
}
