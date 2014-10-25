import java.util.Arrays;
import java.util.Scanner;
public class SortArrayOfStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberWords = input.nextInt();
		
		String words[] = new String[numberWords];
		
		for (int i = 0; i < numberWords; i++) {
			words[i] = input.next();
		}
		Arrays.sort(words);
		for (int i = 0; i < numberWords; i++) {
			System.out.println(words[i]);
		}
	}
}
