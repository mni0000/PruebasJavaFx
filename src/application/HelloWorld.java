package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class HelloWorld extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Text helloWorld = new Text("Hello world");
			BorderPane.setAlignment(helloWorld, Pos.CENTER);
			helloWorld.setFont(new Font(70));
			
			BorderPane root = new BorderPane(helloWorld);
			Scene scene = new Scene(root,1000,400);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.setFill(Color.AQUAMARINE);
			primaryStage.setTitle("Esto es un titulo");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
