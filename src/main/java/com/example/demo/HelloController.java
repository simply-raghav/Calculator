package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    ArrayList<Character> operators = new ArrayList<>(List.of('+','-','*','/'));


    boolean newCal=true;
    @FXML
    Button ButtonDot, Button1, Button2, Button3, Button4, Button5, Button6,Button7,Button8, Button9, Button0;
    @FXML
    public TextField InputText;

    public String display = "";
    @FXML
    void PressedOne(ActionEvent event) {

        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        display = display + "1";
        InputText.setText(display);

    }


    @FXML
    void PressedTwo(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        display = display + "2";
        InputText.setText(display);

    }

    @FXML
    void PressedThree(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        display = display + "3";
        InputText.setText(display);
    }

    @FXML
    void PressedFour(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        display = display + "4";
        InputText.setText(display);
    }

    @FXML
    void PressedFive(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        display = display + "5";
        InputText.setText(display);
    }

    @FXML
    void PressedSix(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        display = display + "6";
        InputText.setText(display);
    }

    @FXML
    void PressedSeven(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        display = display + "7";
        InputText.setText(display);
    }

    @FXML
    void PressedEight(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        display = display + "8";
        InputText.setText(display);
    }

    @FXML
    void PressedNine(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        display = display + "9";
        InputText.setText(display);
    }

    @FXML
    void PressedZero(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(!display.equals("0")) {
            display = display + "0";
            InputText.setText(display);
        }
    }

    @FXML
    void Addition(ActionEvent event) {
        if(operators.contains(display.charAt(display.length()-1))){
            display = display.substring(0, display.length()-1);
        }
        newCal=false;
        display = display + "+";
        InputText.setText(display);
    }

    @FXML
    void Subtraction(ActionEvent event) {
        if(operators.contains(display.charAt(display.length()-1))){
            display = display.substring(0, display.length()-1);
        }
        newCal=false;
        display = display + "-";
        InputText.setText(display);
    }

    @FXML
    void Multiply(ActionEvent event) {
        if(operators.contains(display.charAt(display.length()-1))){
            display = display.substring(0, display.length()-1);
        }
        newCal=false;
        display = display + "*";
        InputText.setText(display);
    }

    @FXML
    void Divide(ActionEvent event) {
        if(operators.contains(display.charAt(display.length()-1))){
            display = display.substring(0, display.length()-1);
        }
        newCal=false;
        display = display + "/";
        InputText.setText(display);
    }

    @FXML
    void backslash(ActionEvent event){
        if(display.length()>0){
            display = display.substring(0,display.length()-1);
            InputText.setText(display);
        }
        if(newCal){
            display = "";
            InputText.setText(display);

        }
    }
    @FXML
    void AllClear(ActionEvent event) {
        display = "0";
        InputText.setText(display);
    }


    public void addDot(ActionEvent event) {

    }

    @FXML
    void Result(ActionEvent event) {
        EvaluateExpression expression = new EvaluateExpression();
        if(display.charAt(0)=='-'){
            display = "0" + display;
        }
        double ans = expression.evaluate(display);
        display = String.valueOf(ans);
        InputText.setText(display);
        newCal = true;
    }

}
