package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Scientific_Controller {

    ArrayList<Character> operators = new ArrayList<>(List.of('+','-','*','/'));
    boolean floatingPoint = false;
    boolean newCal=true;
    @FXML
    public TextField InputText, InputText1;
    Stage stage;
    Scene scene;
    Parent root;
    EvaluateExpression expression = new EvaluateExpression();
    public String display = "", exp ="0";
    int openBracket = 0;

    boolean xpowy=false,yrootx=false, ylog_base_x=false, xMody=false;
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
        if(xpowy){
            display=calXPowerY();
            xpowy=false;
        }
        if(yrootx){
            display=calYRootX();
            yrootx=false;
        }
        if(ylog_base_x){
            display=calXLogBaseY();
            ylog_base_x=false;
        }
        if(xMody){
            display=calMod();
            xMody=false;
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
        if(xpowy){
            display=calXPowerY();
            xpowy=false;
        }
        if(yrootx){
            display=calYRootX();
            yrootx=false;
        }
        if(ylog_base_x){
            display=calXLogBaseY();
            ylog_base_x=false;
        }
        if(xMody){
            display=calMod();
            xMody=false;
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
        if(xpowy){
            display=calXPowerY();
            xpowy=false;
        }
        if(yrootx){
            display=calYRootX();
            yrootx=false;
        }
        if(ylog_base_x){
            display=calXLogBaseY();
            ylog_base_x=false;
        }
        if(xMody){
            display=calMod();
            xMody=false;
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
        if(xpowy){
            display=calXPowerY();
            xpowy=false;
        }
        if(yrootx){
            display=calYRootX();
            yrootx=false;
        }
        if(ylog_base_x){
            display=calXLogBaseY();
            ylog_base_x=false;
        }
        if(xMody){
            display=calMod();
            xMody=false;
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
        if(openBracket==0){
            if(exp.charAt(0)=='-'){
                exp = "0" + exp;
            }
            if(xpowy){
                display=calXPowerY();
                xpowy=false;
            }
            if(yrootx){
                display=calYRootX();
                yrootx=false;
            }
            if(ylog_base_x){
                display=calXLogBaseY();
                ylog_base_x=false;
            }
            if(xMody){
                display=calMod();
                xMody=false;
            }
            double ans = expression.evaluate(exp + display);
            display = String.valueOf(ans);
            InputText1.setText(display);
            exp="0";
            InputText.setText("");
            newCal = true;
        }
    }

    public void Mod(ActionEvent event) {
        if(!display.equals("")){
            display += "Mod";
            xMody=true;
        }
    }
    public String calMod(){
        String[] temp = display.split("Mod");
        double x = Double.parseDouble(temp[0]);
        double y = Double.parseDouble(temp[1]);
        int ans = (int) (x%y);
        return String.valueOf(ans);
    }

    public void ln(ActionEvent event) {
        if(!display.equals("")){
            double var = Double.parseDouble(display);
            double ans = Math.log(var);
            display = String.valueOf(ans);
            InputText1.setText(display);
        }
    }

    public void Power10X(ActionEvent event) {
        double num = Double.parseDouble(display);
        num = Math.pow(10, num);
        display=String.valueOf(num);
        InputText1.setText(display);
    }



    public void XPowerY(ActionEvent event){
        if(!display.equals("")){
            display+="^";
            InputText1.setText(display);
            xpowy=true;
        }
    }
    public String calXPowerY() {
        String[] var = display.split("^");
        double base=Double.parseDouble(var[0]);
        double pow=Double.parseDouble(var[1]);
        return String.valueOf(Math.pow(base,pow));
    }

    public void RootX(ActionEvent event) {
        double num = Double.parseDouble(display);
        num = Math.pow(num, 0.5);
        display=String.valueOf(num);
        InputText1.setText(display);
    }

    public void Log(ActionEvent event) {
        if(!display.equals("")){
            double var = Double.parseDouble(display);
            double ans = Math.log10(var);
            display = String.valueOf(ans);
            InputText1.setText(display);
        }
    }

    public void XSquare(ActionEvent event) {
        double num = Double.parseDouble(display);
        num = Math.pow(num, 2);
        display=String.valueOf(num);
        InputText1.setText(display);
    }

    public void OpenBracket(ActionEvent event) {
        if(operators.contains(exp.charAt(exp.length()-1)) && display.equals("")){
            openBracket++;
            exp+=display+"(";
            display ="";
            InputText.setText(exp);
        }
    }

    public void ClosedBracket(ActionEvent event) {
        if(operators.contains(exp.charAt(exp.length()-1)) && !display.equals("") && openBracket>0){
            openBracket--;
            exp+=display + ")";
            display="";
            InputText.setText(exp);
        }
    }

    public void Factorial(ActionEvent event) {
        int num = Integer.parseInt(display);
        long fact=1;
        while(num>0){
            fact *= num--;
        }
        display=String.valueOf(fact);
        InputText1.setText(display);
    }

    public void oneByX(ActionEvent event) {
        double num = Double.parseDouble(display);
        num = 1/num;
        display=String.valueOf(num);
        InputText1.setText(display);
    }

    public void XCube(ActionEvent event) {
        double num = Double.parseDouble(display);
        num = Math.pow(num, 3);
        display=String.valueOf(num);
        InputText1.setText(display);
    }

    public void CubeRoot(ActionEvent event) {
        double num = Double.parseDouble(display);
        num = Math.pow(num, 1.0/3);
        display=String.valueOf(num);
        InputText1.setText(display);
    }

    public void YRootX(ActionEvent event){
        if(!display.equals("")){
            display += "YRoot";
            InputText1.setText(display);
            yrootx = true;
        }
    }
    public String calYRootX() {
        String[] temp = display.split("YRoot");
        double base = Double.parseDouble(temp[0]);
        double pow = Double.parseDouble(temp[1]);
        newCal=true;
        return String.valueOf(Math.pow(base,1.0/pow));
    }

    public void Power2X(ActionEvent event) {
        double num = Double.parseDouble(display);
        num = Math.pow(2, num);
        display=String.valueOf(num);
        InputText1.setText(display);
        newCal=true;
    }

    public void LogX_BaseY(ActionEvent event) {
        if(!display.equals("")){
            display += "log base";
            ylog_base_x=true;
            InputText1.setText(display);
        }
    }
    public String calXLogBaseY(){
        String[] temp = display.split("log base");
        double x = Double.parseDouble(temp[0]);
        double y = Double.parseDouble(temp[1]);
        double ans = Math.log(x)/Math.log(y);
        newCal=true;
        return String.valueOf(ans);

    }


    public void Switch_to_Standard(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main-Window.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Standard_Controller controller = loader.getController();
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
