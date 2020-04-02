package fxml.Calender;

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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class CalenderController {

    @FXML
    private Button btnExit;

    @FXML
    private BorderPane borderRoot;

    @FXML
    private BorderPane parentContainer;


    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

    public void openHome(ActionEvent actionEvent) throws IOException {
        System.out.println("Home");
        changeScreen("Home");
    }

    public void openStatistic(ActionEvent actionEvent) {
        System.out.println("Statistic");
    }

    public void openCreateSession(ActionEvent actionEvent) throws IOException {
        System.out.println("Create session");
        Parent root = FXMLLoader.load(getClass().getResource(  "../CreateSession/CreateSession.fxml"));
        parentContainer.setRight(root);
    }

    public void openAnnouncement(ActionEvent actionEvent) {
        System.out.println("Announcement");
    }

    private void changeScreen(String view) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../" + view + "/"+ view +".fxml"));
        parentContainer.getChildren().add(root);
        parentContainer.getChildren().remove(borderRoot);
    }
}
