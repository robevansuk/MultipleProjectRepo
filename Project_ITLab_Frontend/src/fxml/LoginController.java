package fxml;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController{
    @FXML
    private TextField txfUsername;

    @FXML
    private TextField txfPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private StackPane parentContainer;

    @FXML
    private BorderPane borderRoot;

    @FXML
    private Button btnExit;


    public void login(javafx.event.ActionEvent actionEvent) throws IOException {
        System.out.println("Login button clicked.");

        Parent root = FXMLLoader.load(getClass().getResource("Calender.fxml"));
        Scene scene = btnLogin.getScene();

        root.translateXProperty().set(scene.getWidth());
        parentContainer.getChildren().add(root);
    }
    public void exit(javafx.event.ActionEvent actionEvent) {

        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}