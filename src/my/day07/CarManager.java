package my.day07;

public class CarManager {

	public static void main(String[] args) {
		Car Audi = new Car();
		Audi.speedUp();
		Audi.speedUp();
		System.out.println("����ӵ� : " +Audi.getCurrentSpeed());
		Audi.breakdown();
		System.out.println("����ӵ� : " +Audi.getCurrentSpeed());
	}
}
