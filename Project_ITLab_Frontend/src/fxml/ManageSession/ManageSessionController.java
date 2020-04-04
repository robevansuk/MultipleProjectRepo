package fxml.ManageSession;

import fxml.Pages;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ManageSessionController{

    @FXML
    private AnchorPane parentAnchor;

    @FXML
    private ListView listSessions;

    @FXML
    private Button btnTest;


    public void editSession(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../" + Pages.EditSession + "/" + Pages.EditSession + ".fxml"));
    }
}
