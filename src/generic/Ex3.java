package generic;

public class Ex3 {

	public static void main(String[] args) {
		
//		파우더를 사용하는 프린터기 생성
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial();
		powder.doPrinting();
		
//		플라스틱을 사용하는 프린터기 생성
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();
	}
	
//	제네릭 사용안햇으면 프린터기 두개 만들었어야 한다.
//	제네릭은 입력시점에 자동으로 컴파일 <T>

}


//제네릭 클래스 만들기 (클래스 생성 시점에 자료형을 정해주세요)
class ThreeDPrinter<T> {

	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}

	public T getMaterial() {
		return material;
	}
}