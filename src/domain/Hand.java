package domain;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	//List of 5 Card objects
	ArrayList<Card> hand;

	public Hand(){	
		this.hand  = new ArrayList<Card>();
	}
	
	public Hand(List<Card> hand){	
		hand = this.hand;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
}
