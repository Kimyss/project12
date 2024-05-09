package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("둘리");
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너");
//		순서가없다 -> index가 없다 add, remove 가능 / 식별자가 없기 떄문에 add 불가능 
//		삭제시 index 아닌 값을 지워줘
		hashSet.remove("도우너");
		
		
//		Iterator 객체생성
		Iterator<String> ir = hashSet.iterator();
		
		while(ir.hasNext()) {	//다음 요소가 있으면
			String member = ir.next();	//다음요소를 가져옴
			System.out.println(member + "**");
			
			if(ir.hasNext() == true) {
				String members = ir.next();	//다음요소를 가져옴
				System.out.println(members + "*");
			}else {
				break;  //브레이크 없으면 영원히 돌아요
			}
			
		}
		
//		일반for문 index필요해
//		람다식 ㄱㄱ
//		값을 저장할 변수 :  자료구조
		for(String member : hashSet) {
			System.out.println(member + " ");
		}
	}

}
