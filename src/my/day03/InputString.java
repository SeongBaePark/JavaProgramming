package my.day03;

import java.util.*;

public class InputString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		String phone;
		System.out.println("이름을 입력하시오 : ");
		name = input.nextLine();
		System.out.println("나이를 입력하시오 : ");
		age = input.nextInt();
		System.out.println("전화번호를 입력하시오 : ");
		input.nextLine();
		phone = input.nextLine();
		System.out.println(name + "님 안녕하세요! " + age + "살이이시네요.");
		System.out.println("전화번호 : " + phone);
	}

}
