import java.util.Scanner;


public class degreesRadians {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		double[] numbers = new double[n];
		String[] measure = new String[n];
		
		for (int i = 0; i < n; i++) {
				if (input.hasNextDouble()) {
				numbers[i] = input.nextDouble();
			}
				if (input.hasNext()) {
				measure[i] = input.next();
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (measure[i].equals("rad")) {
				radToDeg(numbers[i]);
			}
			if (measure[i].equals("deg")) {
				degToRad(numbers[i]);
			}
		}	
	}
	
	public static void degToRad(double degrees) {
		double radians = degrees * 0.0174532925;
		System.out.printf("%.6f rad\n ",radians);
	}
	
	public static void radToDeg(double radians){
		double degrees = radians * 57.2957795;
		System.out.printf("%.6f deg\n ",degrees);
	}
}