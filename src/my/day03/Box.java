package my.day03;

import java.util.*;

public class Box {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, area, circumference;
		System.out.println("�簢���� ���θ� �Է��Ͻÿ� : ");
		x = sc.nextDouble();
		System.out.println("�簢���� ���θ� �Է��Ͻÿ� : ");
		y = sc.nextDouble();
		area = x * y;
		circumference = (2 * x) + (2 * y);
		System.out.println("�簢���� ���̴� " + area + "�Դϴ�.");
		System.out.println("�簢���� �ѷ��� " + circumference + "�Դϴ�.");
		
		
		

	}

}
