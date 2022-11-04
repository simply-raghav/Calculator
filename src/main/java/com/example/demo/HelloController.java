package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
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
    void PressedOne(ActionEvent event) {
        firstnumber = firstnumber + "1";
        display = display + "1";
        InputText.setText(display);

    }

    @FXML
    void PressedTwo(ActionEvent event) {
        firstnumber = firstnumber + "2";
        display = display + "2";
        InputText.setText(display);

    }

    @FXML
    void PressedThree(ActionEvent event) {
        firstnumber = firstnumber + "3";
        display = display + "3";
        InputText.setText(display);
    }

    @FXML
    void PressedFour(ActionEvent event) {
        firstnumber = firstnumber + "4";
        display = display + "4";
        InputText.setText(display);
    }

    @FXML
    void PressedFive(ActionEvent event) {
        firstnumber = firstnumber + "5";
        display = display + "5";
        InputText.setText(display);
    }

    @FXML
    void PressedSix(ActionEvent event) {
        firstnumber = firstnumber + "6";
        display = display + "6";
        InputText.setText(display);
    }

    @FXML
    void PressedSeven(ActionEvent event) {
        firstnumber = firstnumber + "7";
        display = display + "7";
        InputText.setText(display);
    }

    @FXML
    void PressedEight(ActionEvent event) {
        firstnumber = firstnumber + "8";
        display = display + "8";
        InputText.setText(display);
    }

    @FXML
    void PressedNine(ActionEvent event) {
        firstnumber = firstnumber + "9";
        display = display + "9";
        InputText.setText(display);
    }

    @FXML
    void PressedZero(ActionEvent event) {
        if(!firstnumber.equals("0")) {
            firstnumber = firstnumber + "0";
            display = display + "0";
            InputText.setText(display);
        }
    }

    @FXML
    void Addition(ActionEvent event) {
        choice = 1;
        display = display + "+";
        operand1=Integer.valueOf(firstnumber);
        firstnumber = "";
        InputText.setText(display);
    }

    @FXML
    void Subtraction(ActionEvent event) {
        choice = 2;
        display = display + "-";
        operand1=Integer.valueOf(firstnumber);
        firstnumber = "";
        InputText.setText(display);
    }

    @FXML
    void Multiply(ActionEvent event) {
        choice = 3;
        display = display + "×";
        operand1=Integer.valueOf(firstnumber);
        firstnumber = "";
        InputText.setText(display);
    }

    @FXML
    void Divide(ActionEvent event) {
        choice = 4;
        display = display + "/";
        operand1=Integer.valueOf(firstnumber);
        firstnumber = "";
        InputText.setText(display);
    }

    @FXML
    void backslash(ActionEvent event){
    }
    @FXML
    void AllClear(ActionEvent event) {
        firstnumber = "";
        display = "";
        operand1 = 0;
        operand2 = 0;
        InputText.setText(display);
    }

    @FXML
    void Result(ActionEvent event) {
        if(firstnumber.length()==0){
            operand2=0;
        }else{
            operand2=Integer.valueOf(firstnumber);
        }
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
        }else if(choice == 4){
            temp=operand1/operand2;
            InputText.setText(String.valueOf(temp));
        }
        firstnumber = String.valueOf(temp);
        display = String.valueOf(temp);

    }
//    @FXML
//     void keyPressed(KeyEvent event){
//        System.out.println(event.getText());
//        switch (event.getCode().toString()){
//            case "KEYPAD1": PressedOne(new ActionEvent());
//                break;
//            case "2": PressedTwo(new ActionEvent());
//                break;
//            case "3": PressedThree(new ActionEvent());
//                break;
//            case "4": PressedFour(new ActionEvent());
//                break;
//            case "5": PressedFive(new ActionEvent());
//                break;
//            case "6": PressedSix(new ActionEvent());
//                break;
//            case "7": PressedSeven(new ActionEvent());
//                break;
//            case "8": PressedEight(new ActionEvent());
//                break;
//            case "9": PressedNine(new ActionEvent());
//                break;
//            case "0": PressedZero(new ActionEvent());
//                break;
//            case "+": Addition(new ActionEvent());
//                break;
//            case "-": Subtraction(new ActionEvent());
//                break;
//            case "*": Multiply(new ActionEvent());
//                break;
//            case "/": Divide(new ActionEvent());
//                break;
//
//
//
//
//        }
//    }
}
