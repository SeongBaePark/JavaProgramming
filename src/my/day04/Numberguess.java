package my.day04;

import java.util.*;

public class Numberguess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int Ans;
		int nansu = rand.nextInt(100);
		while(true)
		{
			System.out.println("������ �Է��ϼ��� : ");
			Ans = sc.nextInt();
			if (Ans >=0 && Ans <100)
			{
				if (Ans > nansu)
				{
					System.out.println("DOWN");
				}
				else if (Ans < nansu)
				{
					System.out.println("UP");
				}
				else if (Ans == nansu)
				{
					System.out.println("�����Դϴ�.");
					break;
				}
			}
			else
			{
				System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
}
