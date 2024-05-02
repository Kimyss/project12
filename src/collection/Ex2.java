package collection;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<Member>();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");

		list.add(member1);	//회원추가
		list.add(member2);
		list.add(member3);
		list.add(member3);  //위에꺼랑 같은객체 가리킴, 중복 가능하다
		
//		list.add(new Member(1003, "도우너")); 한번에 이렇게도 개능 
		
		
		System.out.println(list.get(0));	//회원 꺼내기
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(0);		//1번째 회원삭제 list, 유동적으로 자리구조 바뀜. 계속 수정 혹은 삭제하면 느려질 수 있어. 계속 삭제 작업 필요할 시 기왕이면 뒤부터
		
		System.out.println("전체 회원 수: " + list.size());
		
		System.out.println("-------");
		
//		리스트 출력하기
		System.out.println(list);
		
		System.out.println("-------");
		
//		for문 이용해서 전체회원정보출력
		for(int i= 0; i < list.size(); i++) {
			Member member = list.get(i);		//리스트에서 회원 꺼냄
			System.out.println(member.toString());
		}
	}

}


// 쇼핑몰 회원
class Member{
	int memberId;	//회원아이디
	String memberName;	//회원이름
	
//	두개의 멤버변수를 초기화 하는 생성자
//	인스턴스 + 초기화
	
	
	
//	주소 대신에 내용을 반환하도록 재정의(?)
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "회원(member)[memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	
	
	
}
