package my.day07;

public class CarManager {

	public static void main(String[] args) {
		Car Audi = new Car();
		Audi.speedUp();
		Audi.speedUp();
		System.out.println("현재속도 : " +Audi.getCurrentSpeed());
		Audi.breakdown();
		System.out.println("현재속도 : " +Audi.getCurrentSpeed());
	}
}
