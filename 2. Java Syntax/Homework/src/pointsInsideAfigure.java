import java.util.Scanner;
public class pointsInsideAfigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Read the points
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if (y < 6 || y > 13.5) {
			System.out.println("Outside");
		}
		else {
			if (x < 12.5 || x > 22.5) {
				System.out.println("Outside");
			}
			else {
				if (y > 8.5 && x > 17.5 && x < 20) {
					System.out.println("Outside");
				}
				else {
					System.out.println("Inside");
				}
			}
		}
		
	}
}
