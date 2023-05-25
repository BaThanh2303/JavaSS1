package javafx;

import com.sun.scenario.effect.impl.prism.PrImage;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.setTitle("T2210A");
        primaryStage.show();
    }
}
