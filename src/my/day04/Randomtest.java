package my.day04;
/**
 * Random Ŭ������ ����Ͽ� 1~3������ ���� ������ �����ϰ�, ����Ͻÿ�.
 * 
 * */

import java.util.*;

public class Randomtest {

	public static void main(String[] args) {
		Random rand = new Random();

		int nansu = rand.nextInt(3) + 1;
		System.out.println(nansu);

	}

}
