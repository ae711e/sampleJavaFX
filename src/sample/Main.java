package sample;

/*
(C) 2017 Алексей Еремин
 by novel http://devcolibri.com/3226
 Построение макета с помощью JavaFX Scene Builder (http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-info-2157684.html)
 
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
    
        //primaryStage.setScene(new Scene(root, 300, 275));
        // по размеру макета
        primaryStage.setScene(new Scene(root, primaryStage.getWidth(), primaryStage.getHeight()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
