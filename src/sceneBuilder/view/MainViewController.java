package sceneBuilder.view;

import java.io.IOException;

import javafx.fxml.FXML;
import sceneBuilder.SceneBuilderMain;

public class MainViewController {
	
	@FXML
	private void returnToMainMenu() throws IOException {
		SceneBuilderMain.showFirstView();
	}

}
