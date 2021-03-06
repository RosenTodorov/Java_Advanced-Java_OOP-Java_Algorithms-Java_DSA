import java.util.Random;
import java.util.Scanner;

public class RandomHandsОf5Cards {

	/**
	 * Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards. 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int hands = scan.nextInt();
		String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" ,"A"};
		char[] suits = {'♣', '♦', '♥', '♠'};
		
		for (int i = 0; i < hands; i++) {
			for (int j = 0; j < 5; j++) {
				int numberCard = random.nextInt(cards.length - 1);
				int numberSuits = random.nextInt(suits.length - 1);
				System.out.printf("%s%c ",cards[numberCard], suits[numberSuits]);
			}	
			System.out.println();
		}
	}
}
