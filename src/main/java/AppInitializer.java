import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        URL resource = this.getClass().getResource("/view/SplashWndowForm.fxml");
        Parent splashcontainer = FXMLLoader.load(resource);


        Scene splashwindow = new Scene(splashcontainer);
        splashwindow.setFill(Color.TRANSPARENT);
        Stage stage = new Stage(StageStyle.TRANSPARENT);
        stage.setScene(splashwindow);
        stage.show();
        stage.centerOnScreen();



//        Parent editor = FXMLLoader.load(getClass().getResource("/view/TextEditorForm.fxml"));
//        Scene editorscene = new Scene(editor);
//
//        primaryStage.setScene(editorscene);
//
//        primaryStage.setTitle("Test Editor");
//        primaryStage.show();
//        primaryStage.centerOnScreen();


    }
}
