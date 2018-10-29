package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CambioDePantalla extends Application{
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//Primera pantalla
			Group root1 = new Group();
			Scene primeraPantalla = new Scene(root1,900,400);
			primeraPantalla.setFill(Color.LIGHTBLUE);
			//Segunta pantalla
			Group root2 = new Group();
			Scene segundaPantalla = new Scene(root2,600,300);
			segundaPantalla.setFill(Color.LIGHTGREEN);
			//Boton para ir de la primera a la segunda
			Button cambiarPantalla = new Button("Ir a la siguiente pantalla");
			cambiarPantalla.setOnMouseClicked(new EventHandler<MouseEvent> () {
					@Override
					public void handle(MouseEvent e) {
						primaryStage.setScene(segundaPantalla);
					}
			});
			root1.getChildren().add(cambiarPantalla);
			//Boton para ir de la segunda a la primera
			Button volver = new Button ("Volver atras");
			volver.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent e) {
					primaryStage.setScene(primeraPantalla);
				}
				
			});
			root2.getChildren().add(volver);
			
			primaryStage.setTitle("Cambio de pantallas");
			primaryStage.setScene(primeraPantalla);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
