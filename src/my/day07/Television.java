package my.day07;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	public Television()
	{
		
	}
	
	public Television(int c, int v, boolean o)
	{
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	
	public static void main(String[] args) {
		Television tel = new Television(17, 50, true);
		tel.print();
	}

}
