package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private TextArea TextOut;

    @FXML
    private TextField searchText;

    @FXML
    private AnchorPane InsertPane;

    @FXML
    private void Button_Remove() {
        TextOut.appendText("Button Button_Remove Action\n");
    }

    @FXML
    private void Button_Restart() {
        TextOut.appendText("Button Button_Restart Action\n");
    }

    @FXML
    private void Button_Install() {
        TextOut.appendText("Button Button_Install Action\n");
    }

    @FXML
    private void searchText() {
        TextOut.appendText("searchText input\n");
    }

    @FXML
    private void Button_search() {
        TextOut.appendText("Button Button_search Action\n");
        TextOut.appendText("Search Text is: " + searchText.getText() + "\n");
    }

    @FXML
    private void Button_Show() throws IOException {
        TextOut.appendText("Button Button_Show Action\n");
        Stage InsertStage = new Stage();
        InsertStage.setTitle("New Window");
        Parent root = FXMLLoader.load(getClass().getResource("insert.fxml"));
        Scene scene = new Scene(root, 850, 558);
        scene.getStylesheets().add(getClass().getResource("insert.css").toExternalForm());
        InsertStage.setScene(scene);
        InsertStage.show();
    }

    @FXML
    private void Button_Show1() throws IOException {
        TextOut.appendText("Button Button_Show Action\n");
    }
}




