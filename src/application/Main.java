package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	private Pane mypane;

	/**
	 * Creates Stage
	 */

	@Override
	public void start(Stage stage) {

		/**
		 * FXML view loader.
		 */

		FXMLLoader loader = new FXMLLoader(getClass().getResource("forest.fxml"));
		try {
			mypane = (Pane) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/**
		 * Sets the title and the scene in the stage.
		 */
		stage.setTitle("Where's the squirrel?");
		stage.setScene(new Scene(mypane));
		stage.show();
	}

	/**
	 * Runs app.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		launch(args);
	}

}