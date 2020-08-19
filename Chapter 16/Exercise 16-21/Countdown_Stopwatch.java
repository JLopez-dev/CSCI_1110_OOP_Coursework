/* Author: John Lopez.
 * Date: 8/19/2020.
 */

package Countdown_Stopwatch;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.input.KeyCode;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;

public class Countdown_Stopwatch extends Application {
    protected TextField count = new TextField();
    protected Media media = new Media(
        "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
    protected MediaPlayer mediaPlayer = new MediaPlayer(media);
    protected Timeline animation;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        count.setAlignment(Pos.CENTER);
        count.setFont(Font.font(60));
        count.setPrefColumnCount(4);

        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        StackPane pane = new StackPane(count);

        animation = new Timeline(
            new KeyFrame(Duration.millis(1000), e -> mediaRun()));
        animation.setCycleCount(Timeline.INDEFINITE);

        count.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                animation.play();
            }
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise_16_21");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void mediaRun() {
        if (Integer.parseInt(count.getText()) > 0) {
            mediaPlayer.pause();
            mediaPlayer.seek(Duration.ZERO);
            count.setText(String.valueOf(
                Integer.parseInt(count.getText()) - 1));
        }
        if (count.getText().equals("0")) {
            animation.pause();
            mediaPlayer.play();
        }
    }
}