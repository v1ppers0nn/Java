import java.util.Scanner;

public class _2_sequencesOfEqualStrings {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String words = input.nextLine();
		String[] enteredWords = words.split(" ");
		System.out.print(enteredWords[0]);
		
		for (int i = 1; i < enteredWords.length; i++) {
			if (enteredWords[i].equals(enteredWords[i - 1])) {
				System.out.print(" " + enteredWords[i]);
			} else {
				System.out.println();
				System.out.print(enteredWords[i]);
			}
		}

	}
	
}
