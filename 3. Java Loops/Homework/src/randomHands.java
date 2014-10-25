import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class randomHands {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int n = input.nextInt();
	
		String[] cards = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] suits = { "♣", "♦", "♥", "♠" };
		
		int random = 0;
		
		for (int r = 0; r < n; r++) {
			for (int i = 0; i < 5; i++) {
				random = rand.nextInt(12+1);
				System.out.print(cards[random]);
				random = rand.nextInt(3+1);
				System.out.print(suits[random]+ " ");
			}
		System.out.println();
		}
	}
}
