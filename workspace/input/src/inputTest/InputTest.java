package inputTest;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		�ʱⰪ : ���� � ���� ���� �� �� �� �ִ� ��
//		���� : 0
//		�Ǽ� : 0.0
//		���� : ' '
//		���ڿ� : null �Ǵ� "" 

		String name = "";

		System.out.print("�̸� : ");
		name = sc.next();

		System.out.println(name + "�� ȯ���մϴ�.");
	}

}