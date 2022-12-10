import java.util.ArrayList;

public class Hand {
	
    public ArrayList<Card> drawHand() {
  
        // instance of deck
    	Deck newDeck = new Deck();

        // new ArrayList for the hand
    	ArrayList<Card> newHand = new ArrayList<Card>();
    	
        // retrieve and shuffle deck
        newDeck.getDeck();
        newDeck.shuffleCards();
        
        // draw five cards
        for(int i = 0; i < 5; i++) {
        	newHand.add(newDeck.dealHand());
        	
        }
        
        return newHand;
        
    }
    
    public boolean isPair(ArrayList<Card> newHand) {
    	
    	int count = 0;
    	
        // if two numbers match, increment count by 1
    	for(int i = 0; i < 5; i++) {
    		for(int j = i+1; j < 5; j++) {
    			if(newHand.get(i).getNumber() == newHand.get(j).getNumber()) {
    				count++;
    				
    			}	
    			
    		}
 
    	}
    
        // at least one match for it to be a pair (two pairs, three of a kind, etc.,
        // are also pairs)
    	if(count >= 1) {
    		return true;
    		
    	}

    	return false;
    
}
    		
    
    public boolean isTwoPair(ArrayList<Card> newHand) {
    
    	int count = 0;
    	
    	ArrayList<Card> temp = new ArrayList<Card>();
    	
    	for(int i = 0; i < 5; i++) {
    		for(int j = i+1; j < 5; j++) {
    			if(newHand.get(i).getNumber() == newHand.get(j).getNumber()) {
    				count++;
    			}	
    			
    		}
 
    	}
    	
        // two matches for two pair
    	if(count >= 2) {
    		return true;
    		
    	}
    	
    	return false;
    	
    }
    
    public boolean isThreeofaKind(ArrayList<Card> newHand) {
    	
    	int count = 0;
    	
    	for(int i = 0; i < 5; i++) {
    		for(int j = i+1; i < 5; i++)
    		if(newHand.get(i).getNumber() == newHand.get(j).getNumber()) {
    			count++;
    					
    		}
    				
    	}
    		
    	if(count >= 3) {
    		return true;
    			
    	}
    	
    	return false;
    	
    }
    
    public boolean isStraight(ArrayList<Card> newHand) {
    	
    	int count = 0;
    	
    	for(int i = 0; i < 1; i++) {
    			if(newHand.get(i+1).getNumber() == newHand.get(i).getNumber()+1 && (newHand.get(i+2)).getNumber() == (newHand.get(i).getNumber()+2) && (newHand.get(i+3)).getNumber() == (newHand.get(i).getNumber()+3) && (newHand.get(i+4)).getNumber() == (newHand.get(i).getNumber()+4)) {
    				count++;
    				
    			}	
    			
    		}
    	
    	if(count == 1) {
    		return true;
    		
    	}
    	
    	return false;
    	
    }
    
    public boolean isFlush(ArrayList<Card> newHand) {
    	
    	int count = 0;
    	
    	for(int i = 0; i < 1; i++) {
    			if(newHand.get(i).getSuit() == newHand.get(i+1).getSuit() && (newHand.get(i)).getSuit() == (newHand.get(i+2).getSuit()) && (newHand.get(i)).getSuit() == (newHand.get(i+3).getSuit()) && (newHand.get(i)).getSuit() == (newHand.get(i+4).getSuit())) {
    				count++;
    				
    			}	
    			
    		}
    	
    	if(count == 1) {
    		return true;
    		
    	}
    	
    	return false;
    	
    }
    
    public boolean isFullHouse(ArrayList<Card> newHand) {
    	
    	int count = 0;
    	ArrayList<Card> temp = new ArrayList<Card>();
    
    	for(int i = 0; i < 5; i++) {
    		for(int j = i+1; j < 5; j++) {
    			for(int k = j+1; k < 5; k++) {
    				if(newHand.get(i).getNumber() == newHand.get(j).getNumber() && newHand.get(j).getNumber() == newHand.get(k).getNumber()) {
    					newHand.remove(i);
        				newHand.remove(j);
        				newHand.remove(k);
        				temp.add(newHand.remove(i));
        				temp.add(newHand.remove(j));
        				temp.add(newHand.remove(k));
    			
    				}	
    				
    			}
    			
    		}
    			
    	}
    	
    	for(int i = 0; i < 2; i++) {
    		if(newHand.get(i).getNumber() == newHand.get(i+1).getNumber()) {
    			count++;
    			
    		}
    		
    	}
    	
    	if(count == 1) {
    		return true;
    		
    	}
    	
    	return false;
    	
    }
        
    public boolean isFourofaKind(ArrayList<Card> newHand) {
        
        int count = 0;
        
        for(int i = 0; i < 2; i++) {
        	if(newHand.get(i).getNumber() == newHand.get(i+1).getNumber() && newHand.get(i).getNumber() == newHand.get(i+2).getNumber() && newHand.get(i).getNumber() == newHand.get(i+3).getNumber()) {
        			count++;
        				
        	}	
        			
        }
     
        	
        if(count == 1) {
        	return true;
        		
       	}
        	
       	return false;
        	
    }
        
    public boolean isStraightFlush(ArrayList<Card> newHand) {
        	
        int count = 0;
        
        for(int i = 0; i < 1; i++) {
        	if(newHand.get(i).getNumber() == newHand.get(i).getNumber()+1 && (newHand.get(i+2)).getNumber() == (newHand.get(i).getNumber()+2) && (newHand.get(i+3)).getNumber() == (newHand.get(i).getNumber()+3) && (newHand.get(i+4)).getNumber() == (newHand.get(i).getNumber()+4)
        	&& newHand.get(i).getSuit() == newHand.get(i+1).getSuit() && (newHand.get(i)).getSuit() == (newHand.get(i+2).getSuit()) && (newHand.get(i)).getSuit() == (newHand.get(i+3).getSuit()) && (newHand.get(i)).getSuit() == (newHand.get(i+4).getSuit())) {
        		count++;
        				
        	}
        		
       	}
        	
        if(count == 1) {
        		return true;
        		
        }
        
        return false;
        	
    }
    
    
    public boolean isRoyalFlush(ArrayList<Card> newHand) {
        	
    	int[] royalRanks = {1, 10, 11, 12, 13};
        int count = 0;
    
        for(int i = 0; i < 1; i++) {
        	for(int j = 0; j < 4; j++) {
        		if(newHand.get(i).getSuit() == newHand.get(i+1).getSuit() && (newHand.get(i)).getSuit() == (newHand.get(i+2).getSuit()) && (newHand.get(i)).getSuit() == (newHand.get(i+3).getSuit()) && (newHand.get(i)).getSuit() == (newHand.get(i+4).getSuit())
        		&& newHand.get(i).getNumber() == royalRanks[j]) {
        			
        		}
        		
        	}
        	
        }
        
    		if(count == 1) {
    			return true;
    			
    		}
    		
    		return false;
    		
		}
    
    public boolean isHighCard(ArrayList<Card> newHand) {
    	
    	int count = 0;
    	
    	for(int i = 0; i < 5; i++) {
    		for(int j = i+1; j < 5; j++) {
    			if(newHand.get(i).getNumber() != newHand.get(j).getNumber()) {
    				count++;
    				
    			}	
    			
    		}
 
    	}
    
    	if(count == 4) {
    		return true;
    		
    	}

    	return false;
    		
    }
    		
    	
 }