package com.example.swipe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.swipe.CustomImage;
import model.swipe.Swipe;

import java.io.IOException;


public class HelloApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        HBox centerbox = new HBox();
        Button btnRight = new Button();
        Image image2 = new Image("File:D:/Kolleg/PRE/6ACIF/BilderMeme/meme1.jpg/Pfeil_Rechts.png");
        btnRight.setGraphic(new ImageView(image2));
        //btnRight.set
        btnRight.setPrefWidth(50);
        Button btnLeft = new Button("Left");
        btnLeft.setPrefWidth(50);

        centerbox.setAlignment(Pos.BASELINE_CENTER);

        CustomImage image = new CustomImage("File:D:/Kolleg/PRE/6ACIF/BilderMeme/meme1.jpg");
        Swipe swipe = new Swipe(image);

        ImageView imageView =new ImageView(swipe.getCurrentImmage());

        centerbox.setPadding(new Insets(10));

        centerbox.getChildren().add(btnLeft);
        centerbox.getChildren().add(imageView);
        centerbox.getChildren().add(btnRight);


        root.setCenter(centerbox);

        EventHandler<ActionEvent> eventRechts = new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent actionEvent)
        {
            swipe.swipeRight();
            imageView.setImage(swipe.getCurrentImmage());

            System.out.println("Rechts");
        }
    };
        EventHandler<ActionEvent> eventLinks = new EventHandler()
        {
            @Override
            public void handle(Event event)
            {
                swipe.swipeLeft();
                imageView.setImage(swipe.getCurrentImmage());
                System.out.println("Links");
            }
        };




        EventHandler<KeyEvent> keyRight = new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent keyEvent)
            {
                if (keyEvent.getCode() == KeyCode.ALT)
                {
                    swipe.swipeRight();
                    imageView.setImage(swipe.getCurrentImmage());

                    System.out.println("Rechts");
                }
            }
        };
        EventHandler<KeyEvent> keyLeft = new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent keyEvent)
            {
                if (keyEvent.getCode() == KeyCode.LEFT)
                {
                    swipe.swipeLeft();
                    imageView.setImage(swipe.getCurrentImmage());

                    System.out.println("Links");
                }
            }
        };



        btnRight.setOnAction(eventRechts);
        btnLeft.setOnAction(eventLinks);


    }

    public static void main(String[] args)
    {
        launch();
    }
}