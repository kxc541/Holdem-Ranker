package game;

import static org.junit.Assert.*;

import org.junit.Test;


public class GameManagerTest {

	GameManager gameManager = new GameManager();
	
	@Test
	public void createHands_obj_from_black_white_hand_inputs() {
		String[] black = {"2H", "3D", "5S", "9C", "KD"};
		String[] white = {"2C", "3H", "4S", "8C", "AH"};
		
		gameManager.createHands(black, white);
		Hands expectedBlack;
		Hands expectedWhite;
		Hands actualBlack;
		Hands actualWhite;
		
		assertSame("failure expected hands are not built correctly", expectedBlack, actualBlack);
		assertSame("failure expected hands are not built correctly", expectedWhite, actualWhite);
	}

}
