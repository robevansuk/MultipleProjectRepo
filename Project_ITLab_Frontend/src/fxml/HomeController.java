package fxml;

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

public class HomeController {
    @FXML
    private Button btnExit;

    @FXML
    private Button btnCalender;

    @FXML
    private Button btnStatistic;

    @FXML
    private Button btnCreateSession;

    @FXML
    private Button btnAnnouncement;

    @FXML
    private StackPane parentContainer;

    @FXML
    private BorderPane borderRoot;

    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

    public void openCalender(ActionEvent actionEvent) throws IOException {
        System.out.println("Calender");
        changeScreen("Calender");
    }

    public void openStatistic(ActionEvent actionEvent) throws IOException {
        System.out.println("Statistic");
        changeScreen("Statistic");
    }

    public void openCreateSession(ActionEvent actionEvent) throws IOException {
        System.out.println("Create session");
        changeScreen("CreateSession");
    }

    public void openAnnouncement(ActionEvent actionEvent) throws IOException {
        System.out.println("Announcement");
        changeScreen("Announcement");
    }

    private void changeScreen(String view) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(view + ".fxml"));
        parentContainer.getChildren().add(root);
        parentContainer.getChildren().remove(borderRoot);
    }

}
