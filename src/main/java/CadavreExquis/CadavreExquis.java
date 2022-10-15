package main.java.CadavreExquis;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CadavreExquis extends Application{


    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CadavreExquis.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

}
