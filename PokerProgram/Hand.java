import java.util.ArrayList;

public class Hand {

    public ArrayList<Card> drawHand() {

        ArrayList<Card> newHand = new ArrayList<Card>();

        Deck newDeck = new Deck();
        newDeck.getDeck();
        newDeck.shuffleCards();

        newHand.add(newDeck.dealCards());

        return newHand;
        
    }

}
