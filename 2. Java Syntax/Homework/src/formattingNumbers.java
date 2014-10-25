import java.util.Scanner;
public class formattingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		String aToHex = Integer.toBinaryString(a);
		
		System.out.print(String.format("|%-10s|%010d|%10.2f|%-10.3f|", Integer.toHexString(a), Integer.parseInt(aToHex), b, c));
		input.close();
	}
}
