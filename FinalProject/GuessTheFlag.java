/* Name: John Lopez.    
 * Date: 10/6/2020.
 */
package GuessTheFlag;

import javafx.application.Application;

import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GuessTheFlag extends Application {
    private int questionNumber = 0;
    private final int max = 10;
    public int Score = 0;
    public int imageX = 150, imageY = 275;

    String[] question = new String[max];
    String[] answer1 = new String[max];
    String[] answer2 = new String[max];
    String[] answer3 = new String[max];
    String[] answer4 = new String[max];
    String[] answer5 = new String[max];
    String[] answer6 = new String[max];
    String[] answer7 = new String[max];
    String[] answer8 = new String[max];
    String[] answer9 = new String[max];
    String[] answer10 = new String[max];
    String[] correctAnswers = new String[max];
    Image[] images = new Image[max];

    Label textScore = new Label();
    Label label = new Label();
    ImageView imageView1 = new ImageView();
    Label userAnswer1 = new Label();
    Label userAnswer2 = new Label();
    RadioButton choice1 = new RadioButton();
    RadioButton choice2 = new RadioButton();
    RadioButton choice3 = new RadioButton();
    ToggleGroup answers = new ToggleGroup();
    RadioButton userAnswered;
    TilePane buttons = new TilePane();
    Button answer = new Button("Submit");
    Button again = new Button("Continue");
    Stage stage = new Stage();
    Pane pane = new Pane();
    Pane gameOverPane = new Pane();
    Stage tempStage = null;
    Scene gameOverScene = null;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        tempStage = primaryStage;
        label.setFont(new Font("Cambria", 26));
        label.setTranslateY(230);
        label.setTranslateX(230);
        label.setText(question[0]);

        HBox answerArea = new HBox();
        answerArea.setTranslateY(350);
        answerArea.setTranslateX(165);
        answerArea.setSpacing(20);

        answer1[0] = "United States";
        answer1[1] = "Iceland";
        answer1[2] = "Australia";
        answer1[3] = "Brazil";
        answer1[4] = "Austria";
        answer1[5] = "China";
        answer1[6] = "Ukrania";
        answer1[7] = "Finland";
        answer1[8] = "Sweden";
        answer1[9] = "Belgium";

        answer2[0] = "Canada";
        answer2[1] = "Russia";
        answer2[2] = "Israel";
        answer2[3] = "Argentina";
        answer2[4] = "Spain";
        answer2[5] = "Scotland";
        answer2[6] = "Ireland";
        answer2[7] = "Nigeria";
        answer2[8] = "South Africa";
        answer2[9] = "India";

        answer3[0] = "Norway";
        answer3[1] = "Japan";
        answer3[2] = "France";
        answer3[3] = "Chile";
        answer3[4] = "Turkey";
        answer3[5] = "Korea";
        answer3[6] = "Colombia";
        answer3[7] = "Croacia";
        answer3[8] = "Italy";
        answer3[9] = "Greece";

        correctAnswers[0] = "United States";
        correctAnswers[1] = "Japan";
        correctAnswers[2] = "Australia";
        correctAnswers[3] = "Chile";
        correctAnswers[4] = "Spain";
        correctAnswers[5] = "China";
        correctAnswers[6] = "Ukrania";
        correctAnswers[7] = "Nigeria";
        correctAnswers[8] = "Italy";
        correctAnswers[9] = "Belgium";

        images[0] = new Image("us.png");
        images[1] = new Image("jp.png");
        images[2] = new Image("au.png");
        images[3] = new Image("cl.png");
        images[4] = new Image("es.png");
        images[5] = new Image("cn.png");
        images[6] = new Image("ua.png");
        images[7] = new Image("ng.png");
        images[8] = new Image("it.png");
        images[9] = new Image("be.png");

        choice1.setText(answer1[0]);
        choice2.setText(answer2[0]);
        choice3.setText(answer3[0]);

        choice1.setToggleGroup(answers);
        choice2.setToggleGroup(answers);
        choice3.setToggleGroup(answers);

        answers.selectedToggleProperty()
                .addListener((ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) -> {
                    userAnswered = (RadioButton) newValue.getToggleGroup().getSelectedToggle();
                });

        userAnswer1.setTranslateY(300);
        userAnswer1.setTranslateX(275);
        userAnswer1.setFont(new Font("Cambria", 20));

        userAnswer2.setTranslateY(300);
        userAnswer2.setTranslateX(230);
        userAnswer2.setFont(new Font("Cambria", 20));

        answerArea.getChildren().addAll(choice1, choice2, choice3);

        answer.setTranslateX(475);
        answer.setTranslateY(345);

        imageView1.setImage(images[0]);
        imageView1.setTranslateY(imageX);
        imageView1.setTranslateX(imageY);

        textScore.setFont(new Font("Cambria", 15));
        textScore.setAlignment(Pos.TOP_RIGHT);
        textScore.setText(Integer.toString(Score));
        textScore.setTranslateY(10);
        textScore.setTranslateX(610);

        Label textScoreValue = new Label("SCORE: ");
        textScoreValue.setFont(new Font("Cambria", 15));
        textScoreValue.setTranslateY(10);
        textScoreValue.setTranslateX(550);

        pane.setStyle("-fx-background-color: LIGHTGREY;");
        Scene scene = new Scene(pane, 650, 500);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        pane.getChildren().addAll(label, answerArea, buttons, answer, userAnswer1, userAnswer2, textScore,
                textScoreValue, imageView1);

        answer.setMaxWidth(Double.MAX_VALUE);
        answer.setOnAction(e -> questionAnswered());
        gameOverScene = new Scene(gameOverPane, 650, 500);
    }

    public void questionAnswered() {

        if (userAnswered.getText().equals(correctAnswers[questionNumber])) {
            Score = Score + 100;
            nextQuestion();
        } else {
            userAnswer2.setText("Incorrect!, Try Again..");
            Score = Score - 50;
            if (Score < 0) {
                Score = 0;
            }
        }
        textScore.setText(String.valueOf(Score));
    }

    public void nextQuestion() {
        questionNumber = (questionNumber + 1);
        if (questionNumber >= 10) {
            gameover1();
        }
        label.setText(question[questionNumber]);
        choice1.setText(answer1[questionNumber]);
        choice2.setText(answer2[questionNumber]);
        choice3.setText(answer3[questionNumber]);
        imageView1.setImage(images[questionNumber]);

        userAnswer1.setText(" ");
        userAnswer2.setText(" ");
    }

    public void gameover1() {

        Label textGO = new Label();
        textGO.setFont(new Font("Cambria", 30));
        textGO.setText("Game Over!");
        textGO.setTranslateY(50);
        textGO.setTranslateX(240);

        again.setTranslateY(150);
        again.setTranslateX(285);

        Label text1 = new Label();
        text1.setFont(new Font("Cambria", 30));
        text1.setText(Integer.toString(Score));
        text1.setTranslateY(250);
        text1.setTranslateX(365);

        Label text2 = new Label("SCORE: ");
        text2.setFont(new Font("Cambria", 30));
        text2.setTranslateY(250);
        text2.setTranslateX(240);

        Stage stage = new Stage();

        gameOverPane.setStyle("-fx-background-color: LIGHTGREY;");

        stage.setScene(gameOverScene);
        stage.setResizable(false);
        stage.show();

        gameOverPane.getChildren().setAll(again, textGO, text1, text2);
        again.setOnAction(e -> cont(stage));
    }

    public void cont(Stage stage) {
        stage.close();
        questionNumber = 0;
        choice1.setText(answer1[0]);
        choice2.setText(answer2[0]);
        choice3.setText(answer3[0]);
        imageView1.setImage(images[0]);
        userAnswer1.setText("");
    }
}