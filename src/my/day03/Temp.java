package my.day03;

import java.util.*;

public class Temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c, f;
		System.out.println("화씨온도를 입력하시오 : ");
		f = sc.nextDouble();
		c = (f - 32) / 9 * 5;
		System.out.println("섭씨온도는 " + c + "입니다.");
	}

}
