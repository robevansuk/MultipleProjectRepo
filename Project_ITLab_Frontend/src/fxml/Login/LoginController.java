package fxml.Login;

import fxml.Pages;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField txfUsername;

    @FXML
    private TextField txfPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private BorderPane parentContainer;

    @FXML
    private BorderPane borderRoot;

    @FXML
    private Button btnExit;

    public void login(ActionEvent actionEvent) throws IOException {
        System.out.println("Login button clicked.");
        //check if login correct


        //on success get home screen
        changeScreen(Pages.Home);

    }

    private void changeScreen(Pages page) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../" + page.name() + "/"+ page.name() +".fxml"));
        Scene scene = borderRoot.getScene();

        root.translateXProperty().set(scene.getWidth());
        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();

        KeyValue keyValue = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_BOTH);
        KeyFrame keyFrame = new KeyFrame(Duration.millis(500), keyValue);

        timeline.getKeyFrames().add(keyFrame);
        timeline.setOnFinished(event->{
            parentContainer.getChildren().remove(borderRoot);
        });
        timeline.play();
    }

    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}