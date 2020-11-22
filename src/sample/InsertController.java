package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class InsertController {
    @FXML
    private TextArea TextOut;

    @FXML
    private TextField Text_Search;

    @FXML
    private void Button_search() {
        TextOut.appendText("Button Button_search Action\n");
        TextOut.appendText("Search Text is: " + Text_Search.getText() + "\n");
    }

    @FXML
    private void Text_Search() {
        TextOut.appendText("Search Text is: " + Text_Search.getText() + "\n");
    }
    @FXML
    private void Button() {
        TextOut.appendText("Button Button Action\n");
    }
}
