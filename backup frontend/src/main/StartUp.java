package main;

import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class StartUp extends Application
//public class StartUp extends Application
{
    public static void main(String[] args)
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

        Parent root = FXMLLoader.load(getClass().getResource("../fxml/Login.fxml"));
        primaryStage.setTitle("Login");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}