import java.util.Scanner;


public class problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int allMinutes = 0;
		while (true) {
			String video = input.nextLine();
			if (video.equals("End")) {
				break;
			}
			String[] separator = video.split(":");
			int hours = Integer.parseInt(separator[0]);
			int minutes = Integer.parseInt(separator[1]);
			allMinutes = (hours * 60) + allMinutes + minutes;
		}
		int allHours = allMinutes / 60;
		allMinutes = allMinutes % 60;
		System.out.printf("%d:%02d\n", allHours, allMinutes);
		
	}
}
