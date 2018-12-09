package huaban;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller  {
    @FXML private Circle circle;
    @FXML protected void  criclebuttonleft(){
        circle.setLayoutX(circle.getLayoutX()-10);
    }
    @FXML protected void  criclebuttonright(){
        circle.setLayoutX(circle.getLayoutX()+10);
    }
    @FXML protected void  criclebuttonup(){
        circle.setLayoutY(circle.getLayoutY()-10);
    }
    @FXML protected void  criclebuttondown(){
        circle.setLayoutY(circle.getLayoutY()+10);
    }
}
