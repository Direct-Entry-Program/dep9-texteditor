package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class SplashWindowFormController {
    public Label lblStatus;

    public void initialize(){
        Timeline timeline = new Timeline();

        KeyFrame keyFrame1 = new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText(" Loading Components..");
            }
        });
        KeyFrame keyFrame2 = new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText(" Loading UI..");
            }
        });
        KeyFrame keyFrame3 = new KeyFrame(Duration.millis(1500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lblStatus.setText(" Starting..");
            }
        });
        KeyFrame keyFrame4 = new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {


                Parent editor = null;
                try {
                    editor = FXMLLoader.load(getClass().getResource("/view/TextEditorForm.fxml"));
                    Scene editorscene = new Scene(editor);

                    Stage primaryStage = new Stage();
                    primaryStage.setScene(editorscene);

                    primaryStage.setTitle("Test Editor");
                    primaryStage.show();
                    primaryStage.centerOnScreen();
                    lblStatus.getScene().getWindow().hide();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }



            }
        });

        timeline.getKeyFrames().addAll(keyFrame1,keyFrame2,keyFrame3,keyFrame4);
        timeline.playFromStart();
    }

}
