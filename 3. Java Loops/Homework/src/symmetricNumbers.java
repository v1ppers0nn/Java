import java.util.Scanner;
public class symmetricNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int firstN = input.nextInt();
		int secondN = input.nextInt();
		
		for (int i = firstN; i <= secondN; i++) {
			String number = "" + i;
			if (number.length() == 1) {
				System.out.println(number);
			} else if (number.length() == 2) {
				if (number.charAt(0) == number.charAt(1)) {
					System.out.println(number);
				} 
			} else if (number.length() == 3) {
				if (number.charAt(0) == number.charAt(2)) {
					System.out.println(number);
				} 
			}
		}
	}

}