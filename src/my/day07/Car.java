package my.day07;

public class Car {
	int speed; 
	int distance;
	String color;
	String Auto;
	String brand;
	
	// �⺻ ������
	public Car() {
		
	}
	
	// ���� ������
	public Car(String color, int speed)
	{
		this.color = color;
		this.speed = speed;
	}
	
	public Car(String color, String Auto, String brand, int speed, int distance)
	{
		this(color, speed); // ������ �� �ڵ�� ù ��
		this.Auto = Auto;
		this.brand = brand;
		this.distance = distance;
	}
		
	public void speedUp() {
		speed += 5;
	} 
	public void breakdown(){
		speed -= 10;
	}
	
	public int getCurrentSpeed()
	{
		return speed;
	}

	public void AutoManual() {
		
	}
	public void Brand() {
		
	}


}
