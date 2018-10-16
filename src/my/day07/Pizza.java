package my.day07;

public class Pizza {
	int size;
	String type;
	
	public Pizza()
	{
		size = 12;
		type = "슈퍼스프림";
	}
	
	public Pizza(int s, String t) {
		size = s;
		type = t;
	}
	public static void main(String[] args) {
		Pizza P1 = new Pizza();
		System.out.println("("+P1.type+", "+P1.size+")");
		Pizza P2 = new Pizza(24, "포테이토");
		System.out.println("("+P2.type+", "+P2.size+")");
		Pizza P3 = new Pizza(36, "나폴리");
		System.out.println("("+P3.type+", "+P3.size+")");

	}

}
