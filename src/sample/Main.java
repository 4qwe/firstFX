package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.stage.Stage;

//Main ist die "primary launch class" und extended "Application"
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //ein Parent ist eine branch node
        //dieses Parent ist dabei auch eine layout component
        //dieses Parent ist die Scene für meine Stage!

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //label ist text innerhalb des fensters
        Label label = new Label("LABELTEXT");

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        //Stage secondaryStage = new Stage();
        //secondaryStage.setScene(new Scene(label, 400, 500));
        //secondaryStage.show();
        //secondaryStage.setFullScreen(true);

    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
