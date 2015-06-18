package game;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import game.GameManager;
import domain.Card;
import domain.Hand;

import org.unitils.*;
import org.unitils.reflectionassert.ReflectionAssert;

public class GameManagerTest {

	GameManager gameManager = new GameManager();
	
	@Test
	public void createHands_obj_from_black_white_hand_inputs() {
		String[] black = {"2H", "3D", "5S", "9C", "KD"};
		String[] white = {"2C", "3H", "4S", "8C", "AH"};
		
		List<Card> blackCards = new ArrayList<Card>();
		blackCards.add(new Card("2", "H"));
		blackCards.add(new Card("3", "D"));
		blackCards.add(new Card("5", "S"));
		blackCards.add(new Card("9", "C"));
		blackCards.add(new Card("K", "D"));

		List<Card> whiteCards = new ArrayList<Card>();
		whiteCards.add(new Card("2", "C"));
		whiteCards.add(new Card("3", "H"));
		whiteCards.add(new Card("4", "S"));
		whiteCards.add(new Card("8", "C"));
		whiteCards.add(new Card("A", "H"));
		
		Hand expectedBlack = new Hand(blackCards);
		Hand expectedWhite = new Hand(whiteCards);
		Hand actualBlack = new Hand(blackCards);
		Hand actualWhite = new Hand(blackCards);
		
		gameManager.createHands(black, white);
		
		ReflectionAssert.assertReflectionEquals(expectedBlack, actualBlack);
	}

}
