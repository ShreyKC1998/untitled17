package Ch14_JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new Button("OK"), 200, 250);
        stage.setTitle("MyJavaFX");
        stage.setScene(scene);
        stage.show();

        Stage stage1 = new Stage();
        stage1.setTitle("Second Stage");
        stage1.setScene(new Scene(new Button("New Stage"), 100, 100));
        stage1.show();
    }
}
