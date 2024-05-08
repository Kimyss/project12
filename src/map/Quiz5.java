package map;

import java.util.Collection;
import java.util.HashMap;

/*
 * Map을 활용하여 쇼핑몰의 회원을 관리하는 프로그램을 구현하세요.
 * MemberHashMap 클래스는 회원을 저장하기 위한 HashMap을 멤버변수로 가지고 있습니다.
 * 그리고 맵에 회원을 추가하는 메소드, 맵에서 회원을 삭제하는 메소드, 회원목록을 출력하는
 * 메소드를 가지고 있습니다.
 * MemberHashMap 클래스를 사용하여 아래와 같이 회원을 추가하고 삭제하세요
 * */

public class Quiz5 {

	public static void main(String[] args) {

		MemberHashMap member = new MemberHashMap();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		member.addMember(member1);
		member.addMember(member2);
		member.addMember(member3);
		member.addMember(member4);
		member.showAllMember();
		
		member.removeMember(1004);
		member.showAllMember();

	}

}

//회원관리 클래스
class MemberHashMap {

//	회원 목록을 저장할 map
	HashMap<Integer, Member> map; // map선언 map도 객체

	public MemberHashMap() {
//		map = new HashMap<Integer, Member>();
		map = new HashMap<>(); // map생성
	}

//	맵에 회원을 추가하는 메소드
	public void addMember(Member member) { // 인자값으로 회원의 정보 받았어
		map.put(member.memberId, member); // key: 식별자 멤버를 찾기위해서, 고유한 값이어야된다. 여기서 회원 번호는 중복 X
	}

//	회원을 삭제하는 메소드
	public void removeMember(int memberId) {
//		해당아이디가 존재하면 삭제하고 메소드 종료
		if (map.containsKey(memberId)) {
			map.remove(memberId);
			System.out.println(memberId + "번 회원을 삭제하였습니다");
			return;
		}
//			없으면 에러메세지 출력
		System.out.println(memberId + "번 회원이 존재하지 않습니다");
	}
	
//	전체회원 출력메소드
//	두가지방법 keyset 사용 value 사용

	public void showAllMember() {
		Collection<Member> values = map.values();
		
//		배열 + 콜렉션 콜렉션자식 올수잇다 밸류
		for(Member member : values) {
			System.out.println(member);
		}
		System.out.println();
	}

}
