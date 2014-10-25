import java.util.Scanner;
public class convertToHex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		String hexNumber = Integer.toHexString(number);
		
		System.out.println(hexNumber);
	}
}
