package com.example;


import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


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
        Platform.exit();
    }
}
