package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class HelloController {

    @FXML
    private TextField InputText;

    private String firstnumber = "";

    private String display = "";
    private Integer choice = 0;

    private Integer operand1 = 0;

    private Integer operand2 = 0;

    private  Integer temp = 0;
    @FXML
    private Pane MainWindow;

    @FXML
    private MenuBar MenuBar;

    @FXML
    private Menu MenuHistory;

    @FXML
    private Button Button1;

    @FXML
    protected void PressedOne(ActionEvent event) {
        firstnumber = firstnumber + "1";
        display = display + "1";
        InputText.setText(display);

    }

    @FXML
    protected void PressedTwo(ActionEvent event) {
        firstnumber = firstnumber + "2";
        display = display + "2";
        InputText.setText(display);

    }

    @FXML
    protected void PressedThree(ActionEvent event) {
        firstnumber = firstnumber + "3";
        display = display + "3";
        InputText.setText(display);
    }

    @FXML
    protected void PressedFour(ActionEvent event) {
        firstnumber = firstnumber + "4";
        display = display + "4";
        InputText.setText(display);
    }

    @FXML
    protected void PressedFive(ActionEvent event) {
        firstnumber = firstnumber + "5";
        display = display + "5";
        InputText.setText(display);
    }

    @FXML
    protected void PressedSix(ActionEvent event) {
        firstnumber = firstnumber + "6";
        display = display + "6";
        InputText.setText(display);
    }

    @FXML
    protected void PressedSeven(ActionEvent event) {
        firstnumber = firstnumber + "7";
        display = display + "7";
        InputText.setText(display);
    }

    @FXML
    protected void PressedEight(ActionEvent event) {
        firstnumber = firstnumber + "8";
        display = display + "8";
        InputText.setText(display);
    }

    @FXML
    protected void PressedNine(ActionEvent event) {
        firstnumber = firstnumber + "9";
        display = display + "9";
        InputText.setText(display);
    }

    @FXML
    protected void PressedZero(ActionEvent event) {
        firstnumber = firstnumber + "0";
        display = display + "0";
        InputText.setText(display);
    }

    @FXML
    protected void Addition(ActionEvent event) {
        choice = 1;
        display = display + "+";
        operand1=Integer.valueOf(firstnumber);
        firstnumber = "";
        InputText.setText(display);
    }

    @FXML
    protected void Subtraction(ActionEvent event) {
        choice = 2;
        display = display + "-";
        operand1=Integer.valueOf(firstnumber);
        firstnumber = "";
        InputText.setText(display);
    }

    @FXML
    protected void Multiply(ActionEvent event) {
        choice = 3;
        display = display + "×";
        operand1=Integer.valueOf(firstnumber);
        firstnumber = "";
        InputText.setText(display);
    }

    @FXML
    protected void AllClear(ActionEvent event) {
        firstnumber = "";
        display = "";
        operand1 = 0;
        operand2 = 0;
        InputText.setText(display);
    }

    @FXML
    protected void Result(ActionEvent event) {
        operand2=Integer.valueOf(firstnumber);
        if(choice == 1){
            temp = operand1 + operand2;
            InputText.setText(String.valueOf(temp));
        } else if (choice == 2) {
            temp = operand1 - operand2;
            InputText.setText(String.valueOf(temp));
        }
        else if (choice == 3) {
            temp = operand1 * operand2;
            InputText.setText(String.valueOf(temp));
        }

    }

}
