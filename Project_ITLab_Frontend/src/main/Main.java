package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) throws IOException
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception
    {
//        DomeinController dc = new DomeinController();
//        MainScreen mainScreen = new MainScreen();
//        Scene scene = new Scene(mainScreen, 700, 400);
////        Font.loadFont(StartUp.class.getResource("Retro.ttf").toExternalForm(), 10);
////        Font.loadFont(StartUp.class.getResource("SFAlienEncounters.ttf").toExternalForm(), 10);
//        String uri = Paths.get("src/styles/style.css").toUri().toString();
//        scene.getStylesheets().add(uri);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Mastermind");
//        primaryStage.show();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/Login.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Login");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }
}
