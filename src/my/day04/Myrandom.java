package my.day04;

import java.util.*;

public class Myrandom {

	public static void main(String[] args) {
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		int n1 = random.nextInt(10);
		int n2 = random.nextInt(3) + 1;
		int n3 = random.nextInt(); // (0) ���ڸ� �־����� ������ int ��ü�������� �������� ����
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}

}
