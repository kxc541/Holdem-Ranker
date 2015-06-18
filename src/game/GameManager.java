package game;

import java.util.ArrayList;

import domain.Card;

public class GameManager {
   
	public void createHands_obj_from_black_white_hand_inputs(String[] black, String[] white) {
		// TODO Auto-generated method stub
		ArrayList<Card> hand = new ArrayList<Card>();
		ArrayList<Card> hand2 = new ArrayList<Card>();
		
		for(int i = 0; i<black.length; i++){
			String str = black[i];
            String number =  Character.toString(str.charAt(0));
            String suit = Character.toString(str.charAt(0));
            
            Card c = new Card(number, suit);
            
            hand.add(c);
			
		}
		
		for(int i = 0; i<white.length; i++){
			String str = white[i];
            String number =  Character.toString(str.charAt(0));
            String suit = Character.toString(str.charAt(0));
            
            Card c = new Card(number, suit);
            
            hand2.add(c);
			
		}
		
		
		
		
	}

	
}
