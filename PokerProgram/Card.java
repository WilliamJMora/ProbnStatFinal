
public class Card {

	private int number;
	private String suit;
	
	// Card constructor
	public Card(int number, String suit) {
		
		this.number = number;
		this.suit = suit;
		
	}
	
	public int getNumber() {
		return number;
		
	}
	
	public void setNumber() {
		this.number = number;
		
	}
	
	public String getSuit() {
		return suit;
		
	}
	
	public void setSuit() {
		this.suit = suit;
		
	}
	
	public String toString() {
		
        String str;

		// 11 represents a Jack
        if (getNumber() == 11) {
            str = "Jack of " + getSuit();
			
        }
        
		// 12 represents a Queen
        else if (getNumber() == 12) {
            str = "Queen of " + getSuit();

        }
        
		// 13 represents a King
        else if (getNumber() == 13) {
            str = "King of " + getSuit();

        }
        
		// 1 represents an Ace
        else if (getNumber() == 1) {
            str = "Ace of " + getSuit();

        }
        
        else {
            str = getNumber() + " of " + getSuit();

	    }
        
        return str;

    }

}