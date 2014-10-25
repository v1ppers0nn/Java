import java.util.Scanner;


public class _6_countSpecifiedWord {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		String word = input.nextLine();
		String[] splitText = text.split("\\W+");

		int count = 0;
		
		for (String currentWord : splitText) {
			if (currentWord.toUpperCase().equals(word.toUpperCase())) {
				count++;
			}
		}
		System.out.println(count);
	
	}
	
}
