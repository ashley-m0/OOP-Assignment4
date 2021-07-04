package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Ashley Mojica
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MenuController {

    //static boolean variable if editTitle was checked
    //static boolean variable if

    //Edit List Tab
        public void editTitleChecked(ActionEvent actionEvent) {

        }

        public void removeTaskChecked(ActionEvent actionEvent) {
        }


        public void updateListButtonPressed(ActionEvent actionEvent) {
        }


    //Add List Tab
        public void addListButtonPressed(ActionEvent actionEvent) {
        }

    //Edit Task Tab
        public void editDescriptionChecked(ActionEvent actionEvent) {
        }

        public void editDateChecked(ActionEvent actionEvent) {
        }

        public void newDate(ActionEvent actionEvent) {
        }

        public void updateTaskButtonPressed(ActionEvent actionEvent) {
        }

    //Add Task Tab
    public void addTaskButtonPressed(ActionEvent actionEvent) {
    }

    //Insert List from External File Tab
        public void scanListButtonPressed(ActionEvent actionEvent) {
        }

        public void singleListInsertedChecked(ActionEvent actionEvent) {
        }

        public void multipleListInsertedChecked(ActionEvent actionEvent) {
        }

    //Save List to External File Tab
        public void saveOneListChecked(ActionEvent actionEvent) {

        }

        public void saveAllLIstChecked(ActionEvent actionEvent) {

        }

        public void saveListButtonPressed(ActionEvent actionEvent) {

        }

    //Universally Used
        public void okButtonPressed(ActionEvent actionEvent) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
            Scene menuScene = new Scene(root);

            Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(menuScene);
            window.show();
        }
}
