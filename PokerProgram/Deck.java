import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public ArrayList<Card> deckofCards;

    public Deck() {

        deckofCards = new ArrayList<Card>();

        String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for(int i = 0; i < suits.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                deckofCards.add(new Card(numbers[j], suits[i]));

            }

        }

    }

    public ArrayList<Card> getDeck() {
        return deckofCards;

    }

    public void shuffleCards() {
        Collections.shuffle(deckofCards);

    }

    public Card dealCards() {
        for(int i = 0; i < 5; i++)
            deckofCards.remove(0);
        
        return null;

    }

}