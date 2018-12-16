package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Label display;
    private String result="0";
    private String operand="";
    private String operator="";
    private SimpleStringProperty res;

    public Controller(){
        res=new SimpleStringProperty();
    }
    public String getRes(){
        return res.get();
    }
    public SimpleStringProperty resProperty(){
        return res;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        res.set("0");
    }

    public void divide(ActionEvent actionEvent) {
        operator="/";
        result=operand;
        operand="";
    }
    public void add(ActionEvent actionEvent) {
        operator="+";
        result=operand;
        operand="";
    }
    public void mod(ActionEvent actionEvent) {
        operator="%";
        result=operand;
        operand="";

    }
    public void multiplie(ActionEvent actionEvent) {
        operator="x";
        result=operand;
        operand="";
    }
    public void subtract(ActionEvent actionEvent) {
        if(operand.equals("")){
            operand+="-";
            res.set(operand);
        }else{
            Double a,b;
            a=Double.parseDouble(result);
            b=Double.parseDouble(operand);
            a+=b;
            result=a.toString();
            operand="";
            res.set("0");
            operator="-";
        }
    }
    public void dot(ActionEvent actionEvent) {
        if(!operand.contains(".")) {
            operand += ".";
            res.set(operand);
        }
    }


    public void seven(ActionEvent actionEvent) {
        operand+="7";
        res.set(operand);
    }
    public void four(ActionEvent actionEvent) {
        operand+="4";
        res.set(operand);
    }
    public void eight(ActionEvent actionEvent) {
        operand+="8";
        res.set(operand);
    }
    public void five(ActionEvent actionEvent) {
        operand+="5";
        res.set(operand);
    }
    public void six(ActionEvent actionEvent) {
        operand+="6";
        res.set(operand);
    }
    public void three(ActionEvent actionEvent) {
        operand+="3";
        res.set(operand);
    }
    public void nine(ActionEvent actionEvent) {
        operand+="9";
        res.set(operand);
    }
    public void two(ActionEvent actionEvent) {
        operand+="2";
        res.set(operand);
    }
    public void one(ActionEvent actionEvent) {
        operand+="1";
        res.set(operand);
    }
    public void zero(ActionEvent actionEvent){
        if(!operand.equals("")) {
            operand = "0";
            res.set(operand);
        }
    }

    public void equal(ActionEvent actionEvent){
        Double a, b;
        a = Double.parseDouble(result);
        result = "0";
        if(operand.equals("")) operand = "0";
        b = Double.parseDouble(operand);
        operand = "";

        switch(operator){
            case "+" :
                a += b;
                res.set(a.toString());
                break;

            case "-" :
                a -= b;
                res.set(a.toString());
                break;
            case "/" :
                if(b==0){
                    res.set("Infinity");
                    return;
                }
                a /= b;
                res.set(a.toString());
                break;

            case "%" :
                a %= b;
                res.set(a.toString());
                break;

            case "x" :
                a *= b;
                res.set(a.toString());
                break;

        }
    }

}
