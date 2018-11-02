package sceneBuilder;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class SceneBuilderMain extends Application {
	
	private Stage primaryStage;
	private static BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Aplicacion realizada con scene builder");
		
		showMain();
		showFirstView();
	}
	
	private void showMain() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("view/MainView.fxml"));
		SceneBuilderMain.mainLayout = loader.load();
		Scene scene = new Scene (mainLayout);
		this.primaryStage.setScene(scene);
		this.primaryStage.show();		
	}
	
	public static void showFirstView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(SceneBuilderMain.class.getResource("view/FirstView.fxml"));
		BorderPane firstViewLayout = loader.load();
		SceneBuilderMain.mainLayout.setCenter(firstViewLayout);	
	}
	
	public static void showSecondView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(SceneBuilderMain.class.getResource("view/SecondView.fxml"));
		BorderPane secondViewLayout = loader.load();
		SceneBuilderMain.mainLayout.setCenter(secondViewLayout);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
