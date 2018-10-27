package application;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GestionEventos extends Application{

	@Override
	public void start(Stage primaryStage) {
		try {
			//Raiz de la escena
			Group root = new Group();
			
			//Rectangulo coloreado
			Rectangle rectangulo = new Rectangle();
			rectangulo.setHeight(100);
			rectangulo.setWidth(200);
			rectangulo.setFill(Color.BROWN);
			rectangulo.setX(200);
			rectangulo.setY(0);
			
			//Imagen de ejemplo junto con su vista
			Image imagen = new Image(new FileInputStream("sample.jpg"));
			ImageView vistaImagen = new ImageView(imagen);
			//vistaImagen.setFitHeight(100);
			vistaImagen.setFitWidth(200);
			vistaImagen.setX(200);
			vistaImagen.setY(80);
			vistaImagen.setPreserveRatio(true);
			
			//Boton para cambiar el rectangulo a color verde
			Button verde = new Button("Verde");
			verde.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent e) {
					rectangulo.setFill(Color.GREEN);
				};
			});
			verde.setLayoutX(200); 
			verde.setLayoutY(220);
			
			//Boton para cambiar el rectangulo a color azul
			Button azul = new Button("Azul");
			azul.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent e) {
					rectangulo.setFill(Color.BLUE);
				};
			});
			azul.setLayoutX(350);
			azul.setLayoutY(220);
			
			//Boton para mostrar la imagen
			Button mostrarImagen = new Button("Mostrar imagen");
			mostrarImagen.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent e) {
					if (!root.getChildren().contains(vistaImagen)) {
						root.getChildren().add(vistaImagen);
					}
				};
			});
			mostrarImagen.setLayoutX(200);
			mostrarImagen.setLayoutY(250);
			
			//Boton para ocultar la imagen
			Button ocultarImagen = new Button("Ocultar imagen");
			ocultarImagen.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent e) {
					root.getChildren().remove(vistaImagen);
				};
			});
			ocultarImagen.setLayoutX(300);
			ocultarImagen.setLayoutY(250);
			
			//Agregamos los nodos a la raiz e instanciamos la escena
			root.getChildren().addAll(rectangulo,verde,azul,mostrarImagen,ocultarImagen);
			Scene scene = new Scene(root,600,300);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Gestion de eventos");
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
