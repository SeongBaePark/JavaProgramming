package my.day07;

public class Account {
	private String regNumber;
	private String name;
	private int balance; // �ܾ�
	
	// ������ (setter�޼ҵ�)
	
	public void setRegNumber(String regnum) {
		regNumber = regnum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// ������ �޼ҵ�(getter�޼ҵ�)
	
	public String getRegNumber() {
		return regNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
}
