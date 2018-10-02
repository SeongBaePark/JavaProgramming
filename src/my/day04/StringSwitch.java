package my.day04;

import java.util.Scanner;

// 1~6월 까지
public class StringSwitch {

	public static void main(String[] args) {
		String month;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월의 이름을 입력하시오 : ");
		month = sc.next();
		
		int monthNumber;
		switch (month)
		{
		case "january":
			monthNumber = 1;
			break;
		case "fabuary":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		case "april":
			monthNumber = 4;
			break;
		case "may":
			monthNumber = 5;
			break;
		case "june":
			monthNumber = 6;
			break;
		default:
			monthNumber = 0;	
		}
		
		System.out.println(monthNumber);
		

	}

}
