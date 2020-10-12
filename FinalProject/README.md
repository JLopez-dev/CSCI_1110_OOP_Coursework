# Project Title

## Synopsis
This is a program about Guessing the flags of Countries.

## Motivation
I build this program to test my knowledge about the content of my module.

## How to Run
Run the program, the program will show a image of a flag with 3 options, once you select the answer you're going to click the "Submit" option in order to 
to know if your answer were good or bad, if its good the program will go to the next question and will give you points, but if its bad the program will let 
you know that you answer was bad and you will lose points.
[Image Caption](sample.png)

## Code Example
Example of my code: 
```
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
```
