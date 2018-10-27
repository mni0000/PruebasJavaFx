package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GestionEventos extends Application{

	@Override
	public void start(Stage primaryStage) {
		try {
			
			Rectangle rectangulo = new Rectangle();
			rectangulo.setHeight(100);
			rectangulo.setWidth(200);
			rectangulo.setFill(Color.BROWN);
			rectangulo.setX(200);
			rectangulo.setY(0);
			
			Button verde = new Button("Verde");
			verde.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent e) {
					rectangulo.setFill(Color.GREEN);
				};
			});
			verde.setLayoutX(200);
			verde.setLayoutY(200);
			
			Group root = new Group(rectangulo,verde);
			Scene scene = new Scene(root,600,300);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//scene.setFill(Color.AQUAMARINE);
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
