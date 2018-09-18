package my.day03;

import java.util.*;

public class Box {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, area, circumference;
		System.out.println("사각형의 가로를 입력하시오 : ");
		x = sc.nextDouble();
		System.out.println("사각형의 세로를 입력하시오 : ");
		y = sc.nextDouble();
		area = x * y;
		circumference = (2 * x) + (2 * y);
		System.out.println("사각형의 넓이는 " + area + "입니다.");
		System.out.println("사각형의 둘레는 " + circumference + "입니다.");
		
		
		

	}

}
