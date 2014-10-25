import java.util.Arrays;
import java.util.Scanner;
public class smallestNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		Arrays.sort(numbers);
		System.out.println(numbers[0]);
	}
}