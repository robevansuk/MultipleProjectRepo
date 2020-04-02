package fxml.CreateSession;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CreateSessionController {
    @FXML
    private Button btnExit;

    @FXML
    private BorderPane borderRoot;

    @FXML
    private Button btnCalender;

    @FXML
    private Button btnStatistic;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnAnnouncement;

    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

    public void openCalender(ActionEvent actionEvent) {
        System.out.println("Calender");
    }

    public void openStatistic(ActionEvent actionEvent) {
        System.out.println("Statistic");
    }

    public void openHome(ActionEvent actionEvent) {
        System.out.println("Home");
    }

    public void openAnnouncement(ActionEvent actionEvent) {
        System.out.println("Announcement");
    }
}
