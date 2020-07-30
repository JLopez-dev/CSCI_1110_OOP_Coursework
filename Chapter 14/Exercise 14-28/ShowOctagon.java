/* Name: John Lopez.
 * Date: 7/28/2020.
 */
package stop.sign;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class ShowOctagon extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) { 
		StackPane stackpane = new StackPane();
                
		// Create a polygon and place polygon to pane
		Polygon polygon = new Polygon();
		polygon.setFill(Color.RED);
                polygon.setStroke(Color.BLACK);
                polygon.setRotate(22.5);
                stackpane.getChildren().add(polygon);
                
                
		
		ObservableList<Double> list = polygon.getPoints();
		
                final double WIDTH = 400, HEIGTH = 400;
		double centerX = WIDTH / 2, centerY = HEIGTH / 2;
		double radius = Math.min(WIDTH, HEIGTH) * 0.4;
              

		// s represents the number of sides of the shape
		// Make sure to update this number when necessary
		int s = 8;
		// Add points to the polygon list
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
                    }    
                
                Text text1 = new Text("STOP");
                text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 
                FontPosture.ITALIC, 50));
                text1.setFill(Color.WHITE);
                stackpane.getChildren().add(text1);
                
                Scene scene = new Scene(stackpane, 400, 400);
		primaryStage.setTitle("ShowPolygon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage 
    }
        
}