import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;


public class _9_listOfLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Character> l1 = new ArrayList<>();
		ArrayList<Character> l2 = new ArrayList<>();
		
		for (Character firstLine : input.nextLine().toCharArray()) {
			l1.add(firstLine);
		}
		
		for (Character secondLine : input.nextLine().toCharArray()) {
			l2.add(secondLine);
		}
		
		ArrayList<Character> result = new ArrayList<>();
		
		result.addAll(l1);
		
		for (int i = 0; i < l2.size(); i++) {
			if (l1.contains(l2.get(i))) {
				continue;
			} else {
				result.add(' ');
				result.add(l2.get(i));
			}
		}
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
}
