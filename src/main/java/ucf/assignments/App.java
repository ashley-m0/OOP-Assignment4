package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App extends Application {

    static AnchorPane root;
    static List<GridPane> grid = new ArrayList<GridPane>();
    static int currIndex = 0;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            root = (AnchorPane)FXMLLoader.load(getClass().getResource("Anchor.fxml"));

            grid.add((GridPane)FXMLLoader.load(getClass().getResource("App.fxml")));
            grid.add((GridPane)FXMLLoader.load(getClass().getResource("Menu.fxml")));
            root.getChildren().add(grid.get(0));

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("ToDo");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setPane (int index){
        root.getChildren().remove(grid.get(currIndex));
        root.getChildren().add(grid.get(index));
        currIndex = index;
    }
}
