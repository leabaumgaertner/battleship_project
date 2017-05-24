package battleshipGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * New Game Scene - Select your Player
 * <p>
 * This is the GUI, if a user starts a new game. Over here the user has to chose
 * whether he want to play alone against the artificial Intelligence or against
 * a human player.
 * <p>
 * 
 * The user has different options. He can start a Game as a <br>
 * single player by pushing the button {@Single Player},<br>
 * or with multiple player by pushing {@Multiplayer}<br>
 * As soon as he chose a mode, the next screen will appear.
 * 
 * <p>
 * 
 * @author Lea Baumgärtner
 * @version 0.1
 */

public class NewGameScreen {


	public VBox getScreen() {
		VBox root = new VBox();

		Label labelTitle = new Label("New Game");
		Label labelTitle2 = new Label("Select your Player!");
		
		
		Button singlePlayer = new Button("Single Player");
		singlePlayer.setOnAction(
				event -> {
					SetShipsScreen_P1 nsc = new SetShipsScreen_P1();
					VBox setShips = nsc.getScreen();
					Scene scene3 = new Scene(setShips, 300, 400);
					OpeningScreen.getPrimaryStage().setScene(scene3);
							
				});
		
	
		Button multiPlayer = new Button("Multi Player");

		root.getChildren().addAll(labelTitle, labelTitle2, singlePlayer, multiPlayer);

		return root;

	}

}