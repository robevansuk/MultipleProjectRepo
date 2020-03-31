package main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;

//  indien verkeerde login
//  public void wrongInputFXML() throws IOException
//        {
//        Parent root = FXMLLoader.load(getClass().getResource(
//                "WrongUsernameFXML.fxml"));
//        Stage errorStage = new Stage();
//        errorStage.setScene(new Scene(root));
//        errorStage.setTitle("Error");
//        errorStage.centerOnScreen();
//        errorStage.show();
//        }
public class LoginScreen extends GridPane
{
    public LoginScreen(/*DomeinController dc, */ MainScreen mainScreen)
    {
        this.setAlignment(Pos.CENTER);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(25, 25, 25, 25));

        //login titel
        Label lblTitle = new Label("Login");
        this.add(lblTitle, 0, 0, 2, 1);

        //gerbuikersnaam tekst
        Label lblUsername = new Label("Gebruikersnaam");
        this.add(lblUsername, 0, 1);

        //gerbuikersnaam tekstveld
        TextField txfUser = new TextField();
        this.add(txfUser, 1, 1);
        txfUser.setId("textField");

        //gerbuikersnaam tekst
        Label lblPassword = new Label("Password");
        this.add(lblPassword, 0, 2);

        //wachtwoord tekstveld
        PasswordField pwfPassword = new PasswordField();
        this.add(pwfPassword, 1, 2);
        pwfPassword.setId("textField");

        //info wachtwoord
        Tooltip tooltip = new Tooltip();
        tooltip.setText("\n" + "passwoordvoorwaarden" + "\n");
        pwfPassword.setTooltip(tooltip);

        //login button
        Button btnLogIn = new Button("Log in");
        setHalignment(btnLogIn, HPos.LEFT);
        this.add(btnLogIn, 0, 4);

        Label errorCode = new Label();
        this.add(errorCode, 5, 0);

//        btnLogIn.setOnAction(new EventHandler<ActionEvent>()
//        {
//
//            @Override
//            public void handle(ActionEvent event)
//            {
//
//                boolean aangemeld = false;
//                try
//                {
//                    if (dc.meldAan(txfUser.getText(), pwfWachtwoord.getText()) == null)
//                    {
//                        throw new IllegalArgumentException();
//                    }
//                    aangemeld = true;
//                } catch (IllegalArgumentException e)
//                {
//                    errorCode.setText(Taal.geefString("getNietCorrecteLogin"));
//                }
//                if (aangemeld)
//                {
//                    //mainScreen.setDc(dc);
//                    mainScreen.toonMenu();
//                }
//            }
//        });



    }
}