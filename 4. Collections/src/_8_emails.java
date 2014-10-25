import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class _8_emails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		Pattern mailPattern = Pattern.compile("\\w+([.-_]+\\w+)*@\\w+([.]\\w+)+");
		Matcher matcher = mailPattern.matcher(text);
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
}
