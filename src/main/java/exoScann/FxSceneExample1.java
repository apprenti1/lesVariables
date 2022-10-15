package main.java.exoScann;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.layout.Pane;

import javafx.scene.shape.Circle;

import java.util.List;

public class FxSceneExample1 extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        // Create the VBox
        VBox root = new VBox();

        // Set the width and height of the VBox
        root.setMinWidth(300);
        root.setMinHeight(600);

        // Add the ImageView to the VBox

        Circle circle = new Circle(250.0f, 50.0f, 50.f);
        Circle circle1 = new Circle(150.0f, 50.0f, 50.f);
        Circle circle3 = new Circle(50.0f, 50.0f, 50.f);

        Group group = new Group(circle,circle1,circle3);
        root.getChildren().add(circle);

        // Set the Style-properties of the VBox
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;"+
                "-fx-background-color: #eba707");

        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Cursor to the Scene

        stage.setScene(scene);
        // Set the Title of the Stage
        stage.setTitle("Setting the Cursor for a Scene");
        // Display the Stage
        stage.show();
    }

}