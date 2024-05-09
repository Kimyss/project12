package collection;
/*
 * 책번호와 제목 멤버로 가지는 Book클래스 만드세요  
 * Book타입의 리스트 생성하세요
 * 리스트에 책 3권 추가하세요
 * 
 * 리스트에 저장된 모든 책의정보 출력하세요
 * 리스트의 모든요소를 삭제하세요
 * */

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book(1, "흥부놀부"));
		bookList.add(new Book(2, "심청이"));
		bookList.add(new Book(3, "딱딱산"));
		
		// 리스트 요소 하나씩 출력
		System.out.println(bookList.get(0));
		System.out.println(bookList.get(1));
		System.out.println(bookList.get(2));
		
		System.out.println();
		
		// 일반 for문 사용
		for (int i = 0; i < bookList.size(); i++) {
			Book book = bookList.get(i);
			System.out.print(book);
		}

		// 람다식 for문 사용
		for (Book book : bookList) { // (배열에서 꺼낸 값을 저장할 변수 : 배열)
			System.out.print(book);
		}

		// 리스트 전체 출력
		System.out.println();
		System.out.println("모든 요소 삭제: " + bookList);

		// 리스트 삭제
//		bookList.clear();

		// 앞에서부터 삭제
		//X
// 		bookList.remove(0);
//		bookList.remove(1);
//		bookList.remove(2);

		//O
//		bookList.remove(0); //중간에 있던 요소가 삭제하면 배열은 연속된 구조이기 때문에 뒤에 있던 요소가 앞으로 한칸 이동한다
//		bookList.remove(0);
//		bookList.remove(0);

		// 뒤에서부터 삭제
//		bookList.remove(2);
//		bookList.remove(1);
//		bookList.remove(0);

	}

	}



class Book{
	int bookNum;
	String bookName;
	
	public Book(int bookNum, String bookName) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookName=" + bookName + "]";
	}
	
	
	
	
}
