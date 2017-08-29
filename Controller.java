package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class Controller {
    @FXML
    public Button calculate1;
    @FXML
    public TextField input;
    @FXML
    public  Label answer;

    public double x;


    public  boolean isInteger(String s)  {
        try {
            Integer.parseInt(s);
        } catch(Exception e) {
            answer.setText("Enter a Good number.");
            answer.setTextFill(Color.RED);
            answer.setVisible(true);
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

    private boolean lengthChacker() {
        if(isInteger(input.getText())){
             x=Integer.parseInt( input.getText());
            if (x<101){

                return true;
            }
        }
        answer.setText("check the Number");
        answer.setTextFill(Color.RED);
        answer.setVisible(true);

        return false;
    }


    public void pressButton(ActionEvent event){
        if(lengthChacker()){
            double ans= equation.equation(x);
            answer.setText(String.valueOf(ans));
            answer.setTextFill(Color.RED);
            answer.setVisible(true);

        }


    }
}
