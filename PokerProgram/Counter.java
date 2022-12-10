import java.util.ArrayList;

public class Counter {
	
	public void counter(int n) {
		
		Hand counter = new Hand();
		ArrayList<Card> hand = counter.drawHand();
			
		int highCards = 0; int pairs = 0; int twoPairs = 0; int threeofaKinds = 0; int straights = 0; int flushes = 0;
		int fullHouses = 0; int fourofaKinds = 0; int straightFlushes = 0; int royalFlushes = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(counter.isHighCard(hand) == true) {
				highCards++;
				
			}
			
			if(counter.isPair(hand) == true) {
				pairs++;
				
			}
			
			if(counter.isTwoPair(hand) == true) {
				twoPairs++;
				
			}
			
			if(counter.isThreeofaKind(hand) == true) {
				threeofaKinds++;
				
			}
			
			if(counter.isStraight(hand) == true) {
				straights++;
				
			}
			
			if(counter.isFlush(hand) == true) {
				flushes++;
				
			}
			
			if(counter.isFullHouse(hand) == true) {
				fullHouses++;
				
			}
			
			if(counter.isFourofaKind(hand) == true) {
				fourofaKinds++;
				
			}
			
			if(counter.isStraightFlush(hand) == true) {
				straightFlushes++;
				
			}
			
			if(counter.isRoyalFlush(hand) == true) {
				royalFlushes++;
				
			}
			
			System.out.println("The probability of getting no pattern is " + (double)highCards/n);
			System.out.println("The probability of getting a pair is " + (double)pairs/n);
			System.out.println("The probability of getting a two pair is " + (double)twoPairs/n);
			System.out.println("The probability of getting a three of a kind is " + (double)threeofaKinds/n);
			System.out.println("The probability of getting a straight is " + (double)straights/n);
			System.out.println("The probability of getting a flush is " + (double)flushes/n);
			System.out.println("The probability of getting a full house is " + (double)fullHouses/n);
			System.out.println("The probability of getting a four of a kind is " + (double)fourofaKinds/n);
			System.out.println("The probability of getting a straight flush is " + (double)straightFlushes/n);
			System.out.println("The probability of getting a royal flush is " + (double)royalFlushes/n);
			
		}

	}	
		
}