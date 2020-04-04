package fxml.Home;

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
import javafx.scene.layout.Border;
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
    private Button btnManageSessions;

    @FXML
    private Button btnEditUser;

    @FXML
    private Button btnAnnouncement;

    @FXML
    private BorderPane parentContainer;

    @FXML
    private BorderPane borderRoot;

    @FXML
    private BorderPane borderPage;

    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

    public void openManageSession(ActionEvent actionEvent) throws IOException {
        System.out.println(Pages.ManageSession.name());
        borderPage.setCenter(FXMLLoader.load(getClass().getResource("../" + Pages.ManageSession.name() + "/"+ Pages.ManageSession.name() +".fxml")));
    }

    public void openStatistic(ActionEvent actionEvent) throws IOException {
        System.out.println(Pages.Statistic.name());
    }

    public void openEditSessions(ActionEvent actionEvent) throws IOException {
        System.out.println(Pages.EditSession.name());
    }

    public void openAnnouncement(ActionEvent actionEvent) throws IOException {
        System.out.println(Pages.Announcement.name());
    }

    public void openEditUser(ActionEvent actionEvent) throws IOException {
        System.out.println(Pages.EditUser.name());
    }

    private void changeScreen(Pages page) throws IOException {

    }
}
