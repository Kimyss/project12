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
