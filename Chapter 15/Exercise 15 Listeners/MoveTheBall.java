/* Name: John Lopez.
 * Date: 8/12/2020.
 */
package MoveTheBall;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveTheBall extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

    double width = 200;
    double height = 200;
    CirclePane circlePane = new CirclePane(width / 2,height / 2, Math.min(width,height) / 15);
  
    HBox hBox = new HBox();
    hBox.setSpacing(5);
    hBox.setAlignment(Pos.CENTER);
    Button btLeft = new Button("Left");
    Button btRight = new Button("Right");
    Button btUp = new Button("Up");
    Button btDown = new Button("Down");  
    hBox.getChildren().add(btLeft);
    hBox.getChildren().add(btRight);
    hBox.getChildren().add(btUp);
    hBox.getChildren().add(btDown);
    
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(circlePane);
    borderPane.setBottom(hBox);

    Scene scene = new Scene(borderPane, width, height);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Move the ball");
    primaryStage.show();
    circlePane.requestFocus();
      
    circlePane.setOnKeyPressed(e -> {
        if(e.getCode() == KeyCode.UP) {
            circlePane.Up();
        }
        if(e.getCode() == KeyCode.DOWN) {
            circlePane.Down();
        }
        if(e.getCode() == KeyCode.LEFT) {
            circlePane.Left();
        }
        if(e.getCode() == KeyCode.RIGHT) {
            circlePane.Right();  
        }
    });
}
private class CirclePane extends Pane {
    private Circle circle = new Circle();

    public CirclePane(double centerX, double centerY, double radius) {
        circle = new Circle(centerX, centerY, radius);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        getChildren().add(circle);
        }

    public void Up() {
        if (circle.getCenterY() - circle.getRadius() - 10 < 0) return;
        circle.setCenterY(circle.getCenterY() - 10);
        }

    public void Down() {
        if (circle.getCenterY() + circle.getRadius() + 10 > getHeight()) return;
        circle.setCenterY(circle.getCenterY() + 10);
        }

    public void Right() {
        if (circle.getCenterX() + circle.getRadius() + 10 > getWidth()) return;
        circle.setCenterX(circle.getCenterX() + 10);
        }

    public void Left() {
        if (circle.getCenterX() - circle.getRadius() - 10 < 0) return;
        circle.setCenterX(circle.getCenterX() - 10);
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
} 