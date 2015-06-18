package game;

import java.util.ArrayList;

import domain.Card;
import domain.Hand;

public class GameManager {
   
	private Hand black;
	private Hand white;
	
	public void createHands(String[] black, String[] white) {

		ArrayList<Card> blackHand = new ArrayList<Card>();
		ArrayList<Card> whiteHand = new ArrayList<Card>();
		
		for(int i = 0; i<black.length; i++){
			String str = black[i];
            String number =  Character.toString(str.charAt(0));
            String suit = Character.toString(str.charAt(0));
            
            Card c = new Card(number, suit);
            
            blackHand.add(c);
		}
		
		for(int i = 0; i<white.length; i++){
			String str = white[i];
            String number =  Character.toString(str.charAt(0));
            String suit = Character.toString(str.charAt(0));
            
            Card c = new Card(number, suit);
            
            whiteHand.add(c);
		}
		
		this.black = new Hand(blackHand);
		this.white = new Hand(whiteHand);
	}

	
}
