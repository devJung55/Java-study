package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		LambdaInter lambdaInter = (number) -> number % 10 == 0;
//		System.out.println(lambdaInter.checkMultipleOf10(10));

		LambdaInter lambdaInter = (number) -> {
			System.out.println("10�� ��� �˻�");
			return number % 10 == 0;
		};

		boolean result = lambdaInter.checkMultipleOf10(100);
		System.out.println(result);
	}
}