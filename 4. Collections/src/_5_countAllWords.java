import java.util.Scanner;


public class _5_countAllWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String n = input.nextLine();
		
		String[] words = n.split("\\w+");
		System.out.println(words.length - 1);
		
	}
}
