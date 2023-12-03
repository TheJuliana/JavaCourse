package com.example;


import java.io.IOException;
import java.util.ArrayList;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Platform;
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

public class GameOverController {
    @FXML
    private ImageView imageview_skeleton;
     @FXML
    public static Text text_game_over;
     @FXML
    private Text text_lost;
     @FXML
    private Button exit_btn;


    public static void SetDefaults() {
        text_game_over = new Text("");
        text_game_over.setFont(Font.loadFont("file:src\\main\\resources\\fonts\\23-SECONDS-TO-MIDNIGHT.TTF", 64));
    }

    @FXML
    private void onExit() throws IOException{
        //text_lost.setText("LOSTLOST");
        Platform.exit();
    }
}
