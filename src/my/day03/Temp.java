package my.day03;

import java.util.*;

public class Temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c, f;
		System.out.println("ȭ���µ��� �Է��Ͻÿ� : ");
		f = sc.nextDouble();
		c = (f - 32) / 9 * 5;
		System.out.println("�����µ��� " + c + "�Դϴ�.");
	}

}
