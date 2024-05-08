package map;

import java.util.HashMap;
import java.util.Set;

//1. 다음과 같이 학생(Student) 클래스를 만드세요.
//속성: 학번, 이름, 국어점수, 수학점수, 영어점수
//
//2. 학생목록을 저장하는 map 객체를 생성하세요. (키:학번, 값:학생정보)
//
//3. 다음과 같이 맵에 학생 3명을 추가하세요.
//( 학번: 1001, 이름: 둘리, 국어: 90, 수학: 80, 영어: 70 )
//( 학번: 1002, 이름: 도우너, 국어: 55, 수학: 65, 영어: 75 )
//( 학번: 1003, 이름: 또치, 국어: 80, 수학: 50, 영어: 50 )
//
//4. 학생별 총점과 평균점수를 구하세요.
//ex) 둘리의 총점: 240, 평균: 80.0
//
//5. 과목별 총점과 평균점수를 구하세요.
//ex) 국어의 총점: 225, 평균: 75.0

public class Quiz4 {

	public static void main(String[] args) {

		HashMap<Integer, Student> studentMap = new HashMap<>();

		Student stu1 = new Student(1001, "둘리", 90, 80, 70);

		studentMap.put(stu1.studentNum, stu1);
		studentMap.put(1002, new Student(1002, "도우너", 55, 65, 75));
		studentMap.put(1003, new Student(1003, "또치", 80, 50, 50));

		System.out.println(studentMap.get(1001));
		System.out.println();
		
//		총점구하기
//		각 키값 1001~ 1003 에서 밸류값 꺼내기..?
		
		Set<Integer> keysss = studentMap.keySet();
		
		for (int key : keysss) {		//리스트나 셋 배열중 가능  map불가능
			
			Student student =  studentMap.get(key);		//학생정보 하나씩 꺼낼 수 있어
			
			int sum = student.korean + student.math + student.eng;
			
			double avg =  sum / 3.0;
			
//			for문안에서 출력해야함
			System.out.println(student.name + sum +" " + avg);
		}
		
//		과목별 총점 평균 구하기
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;
		
		for (int key : keysss) {
			Student student =  studentMap.get(key);
			korSum = korSum + student.korean;
			mathSum = mathSum + student.math;
			engSum = engSum + student.eng;
		}	//for문 끝나야 과목에대 한 정보 나옴
		
//		for문 안에서 출력
		System.out.println("국어의 총점: " + korSum + ", 평균: " + (korSum / 3.0));
		System.out.println("수학의 총점: " + mathSum + ", 평균: " + (mathSum / 3.0));
		System.out.println("영어의 총점: " + engSum + ", 평균: " + (engSum / 3.0));

			
	}

}

class Student {
	int studentNum;
	String name;
	int korean;
	int math;
	int eng;

	public Student(int studentNum, String name, int korean, int math, int eng) {
		super();
		this.studentNum = studentNum;
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", name=" + name + ", korean=" + korean + ", math=" + math
				+ ", eng=" + eng + "]";
	}

}
