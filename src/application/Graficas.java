package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Graficas extends Application{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//Primero un grafico circular
			//Datos de la grafica
			ObservableList<PieChart.Data> datosQueso = FXCollections.observableArrayList(
					new PieChart.Data("Grupo A", 15),
					new PieChart.Data("Grupo B", 35),
					new PieChart.Data("Grupo C", 50)
			);
			
			//Instanciamos la grafica
			PieChart graficaQueso = new PieChart(datosQueso);
			
			//Tocamos algunas propiedades de la grafica
			//Varias de estas propiedades se cargan de forma predeterminada
			graficaQueso.setTitle("Grafica de ejemplo");
			graficaQueso.setClockwise(true);
			graficaQueso.setLabelLineLength(25);
			graficaQueso.setLabelsVisible(true);
			graficaQueso.setStartAngle(60);
			//graficaQueso.setMaxHeight(100);
			
			//Segundo una grafica de lineas
			//Instanciamos los ejes
			NumberAxis ejeX = new NumberAxis (0,15,3);
			ejeX.setLabel("Eje horizontal");
			NumberAxis ejeY = new NumberAxis (0,50,10);
			ejeY.setLabel("Eje vertical");
			
			//Instanciamos la grafica
			LineChart graficaLineas = new LineChart(ejeX, ejeY);
			
			//Preparamos los datos
			XYChart.Series datosLineas = new XYChart.Series();
			datosLineas.setName("Datos de ejemplo");
			datosLineas.getData().add(new XYChart.Data(2,5));
			datosLineas.getData().add(new XYChart.Data(5,10));
			datosLineas.getData().add(new XYChart.Data(8,40));
			datosLineas.getData().add(new XYChart.Data(11,20));
			datosLineas.getData().add(new XYChart.Data(13,35));
			XYChart.Series datosLineas2 = new XYChart.Series();
			datosLineas2.setName("Otros datos");
			datosLineas2.getData().add(new XYChart.Data(1,45));
			datosLineas2.getData().add(new XYChart.Data(6,2));
			datosLineas2.getData().add(new XYChart.Data(7,27));
			datosLineas2.getData().add(new XYChart.Data(12,25));
			datosLineas2.getData().add(new XYChart.Data(14,33));
			
			//Cargamos los datos
			graficaLineas.getData().add(datosLineas);
			graficaLineas.getData().add(datosLineas2);
			
			//Modificamos la posicion de la 2ª grafica
			graficaLineas.setLayoutX(450);
			graficaLineas.setMaxWidth(450);
			
			Group root = new Group(graficaQueso,graficaLineas);
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
