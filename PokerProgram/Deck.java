import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public ArrayList<Card> deckofCards;

    // Deck constructor
    public Deck() {

        // New ArrayList 
        deckofCards = new ArrayList<Card>();

        // Using for loop, create one card with one number and one suit and add it to the ArrayList
        String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for(int i = 0; i < suits.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                deckofCards.add(new Card(numbers[j], suits[i]));

            }

        }

    }

    // gets the deck of cards
    public ArrayList<Card> getDeck() {
        return deckofCards;

    }

    // method to shuffle the deck of cards
    public void shuffleCards() {
        Collections.shuffle(deckofCards);

    }

    // removes the first five card from the deck
    public Card dealCards() {
        for(int i = 0; i < 5; i++)
            deckofCards.remove(0);
        
        return null;

    }

}