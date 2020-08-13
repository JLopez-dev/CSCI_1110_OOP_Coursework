/* Name: John Lopez.
 * Date: 8/13/2020.
 */

package rectangle.on.a.pentagon;

import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.util.Duration;
  
public class PathTransitionDemo extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane 
        Pane pane = new Pane();

        // Create a rectangle
        Rectangle rectangle = new Rectangle (0, 0, 25, 50);
        rectangle.setFill(Color.ORANGE);

        // Create a polygon
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        polygon.setRotate(342);

        // Add circle and rectangle to the pane
        pane.getChildren().add(polygon); 
        pane.getChildren().add(rectangle); 
        
        ObservableList<Double> list = polygon.getPoints();
		
        final double WIDTH = 240, HEIGTH = 190;
	double centerX = WIDTH / 2, centerY = HEIGTH / 2;
	double radius = Math.min(WIDTH, HEIGTH) * 0.4;
        
        int s = 5;
        // Add points to the polygon list
        for (int i = 0; i < s; i++) {
                list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
                list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
            }    

        // Create a path transition 
        FadeTransition ft = new FadeTransition(Duration.millis(3000),rectangle);
        PathTransition pt = new PathTransition(Duration.millis(3000),rectangle);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        pt.setPath(polygon);
        pt.setNode(rectangle);
        pt.setOrientation(
          PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        // Start animation
        pt.play();
        ft.play();
     
        polygon.setOnMousePressed(e -> pt.pause());
        polygon.setOnMouseReleased(e -> pt.play());
       
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setTitle("PathTransitionDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}