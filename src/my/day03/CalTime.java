package my.day03;

public class CalTime {

	public static void main(String[] args) {
		final double LIGHT_SPEED = 30e4;
		double distance = 40e12;
		
		double secs;
		
		secs = distance / LIGHT_SPEED;
		
		double light_year = secs / (60.0 * 60.0 * 24.0 * 365.0);
		System.out.println("걸리는 시간은 " + light_year + "광년입니다.");

	}

}
