package my.day07;

public class HanaBank {

	public static void main(String[] args) {
		Account ac1 = new Account();
		ac1.setRegNumber("110-363-231853");
		ac1.setName("박성배");
		ac1.setBalance(500000);
		
		System.out.println("계좌번호 : " + ac1.getRegNumber());
		System.out.println("예금주명 : " + ac1.getName());
		System.out.println("통잔잔액 : " + ac1.getBalance());

	}

}
