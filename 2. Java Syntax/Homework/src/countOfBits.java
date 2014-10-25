import java.util.Scanner;
public class countOfBits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String binNumber = Integer.toBinaryString(number);
		
		System.out.println(Integer.bitCount(number));
	}

}
