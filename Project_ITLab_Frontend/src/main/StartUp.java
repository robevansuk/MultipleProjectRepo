package main;

import java.nio.file.Paths;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;


public class StartUp extends Application
//public class StartUp extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)
    {
//        DomeinController dc = new DomeinController();
        MainScreen mainScreen = new MainScreen();
        Scene scene = new Scene(mainScreen, 700, 400);
//        Font.loadFont(StartUp.class.getResource("Retro.ttf").toExternalForm(), 10);
//        Font.loadFont(StartUp.class.getResource("SFAlienEncounters.ttf").toExternalForm(), 10);
        String uri = Paths.get("src/styles/style.css").toUri().toString();
        scene.getStylesheets().add(uri);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mastermind");
        primaryStage.show();
    }
}