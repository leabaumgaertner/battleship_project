package gameElement;

import game.Player;

public class Dolphine extends GameElement{
//  Impact on the Game: If a Player shots a Dolphine, he / she will get minus points.
	
	int size;
	
	
	Dolphine() {
		super(1);					// Dolphine has ID 1
		GameElement.getSize();		// get his size
	}
	
	public void dolphinImpact() {
		int points;
		int minusPoints = -100;	// Punkte sind noch variable festzulegen
		
		
	}
	
	
	/*public  int dolphineImpact() {
		int hits;
		// hits = Player.getCountedPoints(Player.countPoints());
	}*/
}

