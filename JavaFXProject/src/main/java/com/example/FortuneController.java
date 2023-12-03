package com.example;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javafx.fxml.FXMLLoader;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
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
        //resulted_text = new Text("");
        
        //resulted_text.setFill(Color.WHITE);
   
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
               // System.out.println(angle);
                numberOfSegment = wheel.getRotate() % 360/36;
                //System.out.println(numberOfSegment);
                //System.out.println(prizes.get((int)numberOfSegment));
                if ("GAME OVER".equals(prizes.get((int)numberOfSegment))) {
                    try {
                        
                    resulted_text.setText(prizes.get((int)numberOfSegment)+"!");
                    App.setRoot("game_over");
                    } catch (IOException e1) {
                        // Auto-generated catch block
                        e1.printStackTrace();
                    }
                } else {
                
                    //System.out.println(prizes.get((int)numberOfSegment));
                    resulted_text.setText("You win the\n"+prizes.get((int)numberOfSegment)+"!");
                    //title.setText("You win the\n"+prizes.get((int)numberOfSegment)+"!");
                    //System.out.println(resulted_text);
             
                }
			}
		});
        //System.out.println("You pressed some button!");
    }


}
