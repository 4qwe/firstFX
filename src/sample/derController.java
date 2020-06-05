package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class derController {
@FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;

    public void nameAll() {
        btn2.setText("ein neuer name 2");
        btn3.setText("ein neuer name 3");
        btn4.setText("ein neuer name 4");
        btn5.setText("ein neuer name 5");
        btn6.setText("ein neuer name 6");
    }

}
