import java.util.Scanner;


public class _7_countSubString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine().toLowerCase();
		String word = input.nextLine().toLowerCase();
		
		int count = 0;
		
		for (int i = 0; i <= text.length() - word.length(); i++) {
			if (text.substring(i, i + word.length()).equals(word))
					count++;
		}
		
		System.out.println(count);
	
	}
	
}
