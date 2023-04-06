package Package_1.generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		System.out.println(printer);
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>();
		printer2.setMaterial(new Plastic());
		System.out.println(printer2);
		
		ThreeDPrinter<Watter> printer3 = new ThreeDPrinter<Watter>();	
		printer3.setMaterial(new Watter());  // Material상속받은 것만 사용가능
		System.out.println(printer3);
	}

}
