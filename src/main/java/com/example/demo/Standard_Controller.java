package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Standard_Controller {

    ArrayList<Character> operators = new ArrayList<>(List.of('+','-','*','/'));
    boolean floatingPoint = false;
    boolean newCal=true;
    @FXML
    public TextField InputText, InputText1;

    Stage stage;
    Scene scene;
    Parent root;
    @FXML
    Button ButtonExpand;
    EvaluateExpression expression = new EvaluateExpression();
    public String display = "", exp ="0";
    @FXML
    void PressedOne(ActionEvent event) {

        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(display.equals("0")){
            display="";
        }
        display = display + "1";
        InputText1.setText(display);
    }
    @FXML
    void PressedTwo(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(display.equals("0")){
            display="";
        }
        display = display + "2";
        InputText1.setText(display);

    }
    @FXML
    void PressedThree(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(display.equals("0")){
            display="";
        }
        display = display + "3";
        InputText1.setText(display);
    }
    @FXML
    void PressedFour(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(display.equals("0")){
            display="";
        }
        display = display + "4";
        InputText1.setText(display);
    }
    @FXML
    void PressedFive(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(display.equals("0")){
            display="";
        }
        display = display + "5";
        InputText1.setText(display);
    }
    @FXML
    void PressedSix(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(display.equals("0")){
            display="";
        }
        display = display + "6";
        InputText1.setText(display);
    }
    @FXML
    void PressedSeven(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(display.equals("0")){
            display="";
        }
        display = display + "7";
        InputText1.setText(display);
    }
    @FXML
    void PressedEight(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(display.equals("0")){
            display="";
        }
        display = display + "8";
        InputText1.setText(display);
    }
    @FXML
    void PressedNine(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(display.equals("0")){
            display="";
        }
        display = display + "9";
        InputText1.setText(display);
    }
    @FXML
    void PressedZero(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
        }
        if(display.equals("0")){
            display="";
        }
        display = display + "0";
        InputText1.setText(display);

    }
    @FXML
    void Addition(ActionEvent event) {

        if(operators.contains(exp.charAt(exp.length()-1)) && display.equals("")){
            exp = exp.substring(0, exp.length()-1);
        }
        newCal=false;
        if(exp.equals("0")){
            exp = display + "+";
        }else{
            exp+= display + "+";
        }
        display ="";
        InputText1.setText(display);
        InputText.setText(exp);
        floatingPoint = false;
    }
    @FXML
    void Subtraction(ActionEvent event) {

        if(operators.contains(exp.charAt(exp.length()-1)) && display.equals("")){
            exp = exp.substring(0, exp.length()-1);
        }
        newCal=false;
        if(exp.equals("0")){
            exp = display + "-";
        }else{
            exp+= display + "-";
        }
        display ="";
        InputText1.setText(display);
        InputText.setText(exp);
        floatingPoint = false;
    }
    @FXML
    void Multiply(ActionEvent event) {

        if(operators.contains(exp.charAt(exp.length()-1)) && display.equals("")){
            exp = exp.substring(0, exp.length()-1);
        }
        newCal=false;
        if(exp.equals("0")){
            exp = display + "*";
        }else{
            exp+= display + "*";
        }
        display ="";
        InputText1.setText(display);
        InputText.setText(exp);
        floatingPoint = false;
    }

    @FXML
    void Divide(ActionEvent event) {

        if(operators.contains(exp.charAt(exp.length()-1)) && display.equals("")){
            exp = exp.substring(0, exp.length()-1);
        }
        newCal=false;
        if(exp.equals("0")){
            exp = display + "/";
        }else{
            exp+= display + "/";
        }
        display ="";
        InputText1.setText(display);
        InputText.setText(exp);
        floatingPoint = false;
    }

    @FXML
    void backslash(ActionEvent event){
        if(display.length()>0){
            if(display.charAt(display.length()-1) == '.'){
                floatingPoint = false;
            }
            display = display.substring(0,display.length()-1);
            InputText1.setText(display);
        }
        if(newCal){
            display = "";
            InputText1.setText(display);
        }
    }
    @FXML
    void AllClear(ActionEvent event) {
        display = "";
        InputText.setText(display);
        InputText1.setText(display);
        exp="0";
    }


    public void addDot(ActionEvent event) {
        if(newCal){
            newCal=false;
            AllClear(new ActionEvent());
            display = "0";
        }
        if(!floatingPoint){
            if(display.equals("")){
                display="0";
            }
            display = display + ".";
            floatingPoint = true;
        }
        InputText1.setText(display);
    }

    @FXML
    void Result(ActionEvent event) {
        if(exp.charAt(0)=='-'){
            exp = "0" + exp;
        }
        double ans = expression.evaluate(exp + display);
        display = String.valueOf(ans);
        InputText1.setText(display);
        exp="0";
        InputText.setText("");
        newCal = true;
    }



    public void calculatePercentage(ActionEvent event) {
        if(exp.charAt(exp.length()-1) == '+' || exp.charAt(exp.length()-1) == '-'){
            double ans=expression.evaluate(exp.substring(0,exp.length()-1));
            double percent = Double.parseDouble(display);
            percent/=100;
            ans = percent*ans;
            display = String.valueOf(ans);
        }else{
            double percent = Double.parseDouble(display);
            percent/=100;
            display = String.valueOf(percent);
        }
        InputText1.setText(display);
    }

    public void Switch_to_scientific(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scientific-Window.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Scientific_Controller controller = loader.getController();
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
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

}
