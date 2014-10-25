import java.util.Arrays;
import java.util.Scanner;


public class _1_sortArraysOfNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}
		
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" " + numbers[i]);
		}
	}
}
