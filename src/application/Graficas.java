package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Graficas extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			ObservableList<PieChart.Data> datosQueso = FXCollections.observableArrayList(
					new PieChart.Data("Grupo A", 15),
					new PieChart.Data("Grupo B", 35),
					new PieChart.Data("Grupo C", 50)
			);
			PieChart graficaQueso = new PieChart(datosQueso);
			graficaQueso.setTitle("Grafica de ejemplo");
			graficaQueso.setClockwise(true);
			graficaQueso.setLabelLineLength(25);
			graficaQueso.setLabelsVisible(true);
			graficaQueso.setStartAngle(60);
			//graficaQueso.setMaxHeight(100);
			
			
			Group root = new Group(graficaQueso);
			Scene scene = new Scene(root,900,600);
			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Graficas de ejemplo");
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
