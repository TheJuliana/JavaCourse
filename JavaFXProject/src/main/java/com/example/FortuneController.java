package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.event.EventHandler;

public class FortuneController {
    @FXML
    private static Pane pane;
    @FXML
    private ImageView wheel;
    @FXML
    private ImageView pointer;
    @FXML
    private Button spinning_button;
    @FXML
    private static Label title;
    @FXML
    private Text resulted_text;


    private static RotateTransition path = new RotateTransition();
    private int angle;
    private int duration;
    private double numberOfSegment;
    
    private static ArrayList<String> prizes = new ArrayList<String>();

    private static void addList(){
    prizes.add("TV");
    prizes.add("Phone");
    prizes.add("Car");
    prizes.add("Jackpot");
    prizes.add("GAME OVER");
    prizes.add("Jackpot");
    prizes.add("Tablet");
    prizes.add("Camera");
    prizes.add("Watch");
    prizes.add("Cardio machine");
    
    }

    @FXML
    public static void SetDefaults() {
    title = new Label("");
    title.setFont(Font.loadFont("file:src\\main\\resources\\fonts\\23-SECONDS-TO-MIDNIGHT.TTF", 64));
    pane = new Pane();
    addList();
    path = new RotateTransition();
    }


    
    @FXML
    private void Spin() throws IOException{

        resulted_text.setText("");
        resulted_text.setFill(Color.WHITE);
        angle = (int)(Math.random()*3001+2000);
        duration = angle/1000;

        path.setNode(wheel);
        path.setDuration(Duration.seconds(duration));
        path.setByAngle(angle);
        path.setInterpolator(Interpolator.EASE_BOTH);
        path.play();
        path.setOnFinished(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                numberOfSegment = wheel.getRotate() % 360/36;
                if ("GAME OVER".equals(prizes.get((int)numberOfSegment))) {
                    try {                       
                        resulted_text.setText(prizes.get((int)numberOfSegment)+"!");
                        App.setRoot("game_over");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    resulted_text.setText("You win the\n"+prizes.get((int)numberOfSegment)+"!");
                }
            }
        });
    }

}
