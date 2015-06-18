package game;
import static org.junit.Assert.*;

import org.junit.Test;

import game.GameManager;
import domain.Hand;


public class GameManagerTest {

	GameManager gameManager = new GameManager();
	
	@Test
	public void createHands_obj_from_black_white_hand_inputs() {
		String[] black = {"2H", "3D", "5S", "9C", "KD"};
		String[] white = {"2C", "3H", "4S", "8C", "AH"};
		
		gameManager.createHands(black, white);
		domain.Hand expectedBlack;
		domain.Hand expectedWhite;
		domain.Hand actualBlack;
		domain.Hand actualWhite;
		
		assertSame("failure expected hands are not built correctly", expectedBlack, actualBlack);
		assertSame("failure expected hands are not built correctly", expectedWhite, actualWhite);
	}

}
