package ambiguity;

public class ClassB extends ClassA implements InterA/* , InterB */ {
	
//	@Override
//	public void printData() {
//		InterA.super.printData();
//	}
	
	public static void main(String[] args) {
		new ClassB().printData();
	}
}
