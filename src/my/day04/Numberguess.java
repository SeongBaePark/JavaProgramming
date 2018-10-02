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
			System.out.println("정답을 입력하세요 : ");
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
					System.out.println("정답입니다.");
					break;
				}
			}
			else
			{
				System.out.println("숫자를 잘못입력하셨습니다.");
			}
		}
	}
}
