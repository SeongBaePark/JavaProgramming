package my.day07;

public class HanaBank {

	public static void main(String[] args) {
		Account ac1 = new Account();
		ac1.setRegNumber("110-363-231853");
		ac1.setName("�ڼ���");
		ac1.setBalance(500000);
		
		System.out.println("���¹�ȣ : " + ac1.getRegNumber());
		System.out.println("�����ָ� : " + ac1.getName());
		System.out.println("�����ܾ� : " + ac1.getBalance());

	}

}
