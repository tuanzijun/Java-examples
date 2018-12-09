package jisuanqi;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {
    @FXML private TextField result;
    @FXML private TextField t1;
    @FXML private TextField t2;
    String flag;

    public void addbt(){
        int number = Integer.parseInt(t1.getText().trim()) + Integer.parseInt(t2.getText().trim());
        flag = number+"";
        result.setText(flag);
    }
    public void subtractbt(){
        int number = Integer.parseInt(t1.getText().trim()) - Integer.parseInt(t2.getText().trim());
        flag = number + "";
        result.setText(flag);
    }
    public void multiplybt(){
        int number = Integer.parseInt(t1.getText().trim()) * Integer.parseInt(t2.getText().trim());
        flag = number+"";
        result.setText(flag);
    }
    public void dividebt(){
        int number = Integer.parseInt(t1.getText().trim()) / Integer.parseInt(t2.getText().trim());
        flag = number+"";
        result.setText(flag);
    }

}
