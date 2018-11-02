package sceneBuilder.view;

import java.io.IOException;

import javafx.fxml.FXML;
import sceneBuilder.SceneBuilderMain;

public class FirstViewController {

	@FXML
	private void siguiente() throws IOException {
		SceneBuilderMain.showSecondView();
	}
}
