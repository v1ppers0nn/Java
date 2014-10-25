import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;


public class _10_extractUniqueWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String read = input.nextLine();
		
		String pattern = "//W+";
		
		TreeSet<String> set = new TreeSet<>();
		
		for (String string : read.split(pattern)) {
			set.add(string.toLowerCase());
		}
		
		for (String string : set) {
			System.out.println(string);
		}
	}
	
}
