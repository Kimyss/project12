package generic;

public class Ex2 {

	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder();	//powder를 재료로 선택, plastic도 마찬가지방법으로 개능
		
		printer.setMaterial(p1);	//매개변수가 자동으로 형변환 됨 Object material = p1;
		
//		재료를 꺼낼떄는 직접 형변환 해야함
		Powder p2 = (Powder)printer.getMaterial();
		
		p2.doPrinting();
		

	}

}

class ThreeDPrinter3 {

	private Object material;

	public void setMaterial(Object material) {
		this.material = material;
//		멤버변수 (파랭이) = 지역변수(갈색이)
	}

	public Object getMaterial() {
		return material;
	}
}