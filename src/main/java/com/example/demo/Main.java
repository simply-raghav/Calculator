package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader standardFxmlLoader = new FXMLLoader(Main.class.getResource("Main-Window.fxml"));
        Scene standardScene = new Scene(standardFxmlLoader.load(), 363, 424);
        stage.setTitle("Calculator");
        stage.setScene(standardScene);
        stage.show();
        stage.setResizable(false);
        Standard_Controller controller = standardFxmlLoader.getController();

        controller.AllClear(new ActionEvent());
        standardScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println(event.getCode() + "\t" + event.getText());

                switch (event.getCode()) {
                    case DIGIT0, NUMPAD0 -> controller.PressedZero(new ActionEvent());
                    case DIGIT1, NUMPAD1 -> controller.PressedOne(new ActionEvent());
                    case DIGIT2, NUMPAD2 -> controller.PressedTwo(new ActionEvent());
                    case DIGIT3, NUMPAD3 -> controller.PressedThree(new ActionEvent());
                    case DIGIT4, NUMPAD4 -> controller.PressedFour(new ActionEvent());
                    case DIGIT5, NUMPAD5 -> controller.PressedFive(new ActionEvent());
                    case DIGIT6, NUMPAD6 -> controller.PressedSix(new ActionEvent());
                    case DIGIT7, NUMPAD7 -> controller.PressedSeven(new ActionEvent());
                    case DIGIT8, NUMPAD8 -> controller.PressedEight(new ActionEvent());
                    case DIGIT9, NUMPAD9 -> controller.PressedNine(new ActionEvent());
                    case ADD, PLUS -> controller.Addition(new ActionEvent());
                    case SUBTRACT, MINUS -> controller.Subtraction(new ActionEvent());
                    case MULTIPLY -> controller.Multiply(new ActionEvent());
                    case DIVIDE -> controller.Divide(new ActionEvent());
                    case EQUALS, ENTER -> controller.Result(new ActionEvent());
                    case BACK_SPACE -> controller.backslash(new ActionEvent());
                    case DECIMAL -> controller.addDot(new ActionEvent());
                }
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }

}