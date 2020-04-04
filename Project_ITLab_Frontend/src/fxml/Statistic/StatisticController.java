package fxml.Statistic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StatisticController {

    @FXML
    private Button btnExit;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnCalender;

    @FXML
    private Button btnCreateSession;

    @FXML
    private Button btnAnnouncement;

    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

    public void openCalender(ActionEvent actionEvent) {
        System.out.println("Calender");
    }

    public void openHome(ActionEvent actionEvent) {
        System.out.println("Home");
    }

    public void openCreateSession(ActionEvent actionEvent) {
        System.out.println("Create session");
    }

    public void openAnnouncement(ActionEvent actionEvent) {
        System.out.println("Announcement");
    }

}
