package my.day03;

import java.util.*;

public class InputString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		String phone;
		System.out.println("�̸��� �Է��Ͻÿ� : ");
		name = input.nextLine();
		System.out.println("���̸� �Է��Ͻÿ� : ");
		age = input.nextInt();
		System.out.println("��ȭ��ȣ�� �Է��Ͻÿ� : ");
		input.nextLine();
		phone = input.nextLine();
		System.out.println(name + "�� �ȳ��ϼ���! " + age + "�����̽ó׿�.");
		System.out.println("��ȭ��ȣ : " + phone);
	}

}
