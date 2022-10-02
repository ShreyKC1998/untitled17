package Ch14_JavaFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class MyJavaFX extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        //Create a scene and place a button in the scen
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        stage.setTitle("MyJavaFX");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
