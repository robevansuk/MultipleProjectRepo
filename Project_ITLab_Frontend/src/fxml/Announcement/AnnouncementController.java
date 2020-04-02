package fxml.Announcement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AnnouncementController {
    @FXML
    private Button btnExit;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnStatistic;

    @FXML
    private Button btnCreateSession;

    @FXML
    private Button btnCalender;

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

    public void openCreateSession(ActionEvent actionEvent) {
        System.out.println("Create session");
    }

    public void openHome(ActionEvent actionEvent) {
        System.out.println("Home");
    }
}
