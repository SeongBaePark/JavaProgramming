package my.day07;

public class Account {
	private String regNumber;
	private String name;
	private int balance; // 잔액
	
	// 설정자 (setter메소드)
	
	public void setRegNumber(String regnum) {
		regNumber = regnum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 접근자 메소드(getter메소드)
	
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
