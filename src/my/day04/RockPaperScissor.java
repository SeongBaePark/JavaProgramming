package my.day04;

import java.util.*;

public class RockPaperScissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	public static void main(String[] args) {
		Random random = new Random();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2) : ");
		int user = sc.nextInt();
		
		int computer = random.nextInt(3);
		if (user == computer)
		{
			System.out.println("�ΰ��� ��ǻ�Ͱ� �����ϴ�.");
		}
		else if (((user == 0) && (computer == 2))| ((user == 1) && (computer == 0))
				|((user == 2) && (computer == 1)))
		{
			System.out.println("�ΰ� : " + user + "��ǻ�� : " + computer + "�ΰ� �¸�");
		}
		else if (((computer == 0) && (user == 2))| ((computer) == 1 && (user == 0))
				| ((computer == 2) && (user == 1)))
		{
			System.out.println("�ΰ� : " + user + "��ǻ�� : " + computer + "��ǻ�� �¸�");
		}
		else
		{
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

}
