import java.util.Scanner;
public class triangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int ax = input.nextInt();
		int ay = input.nextInt();
		
		int bx = input.nextInt();
		int by = input.nextInt();
		
		int cx = input.nextInt();
		int cy = input.nextInt();
		
		int area = ((ax*(by - cy) + bx*(cy - ay) + cx*(ay-by)) / 2);
		
		if (area > 0) {
			System.out.println(area);
		}
		else {
			System.out.println(area * -1);
		}
	}
}
