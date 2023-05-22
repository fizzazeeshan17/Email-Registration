package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;
import java.io.IOException;

public class SecondController {

    //Handle buttons
    //Store items from list in list view
    //change scenes

        @FXML
    private void BackButton(ActionEvent event) throws IOException {

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/sample.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene); }

         @FXML
        ListView<String> lv;
        ListView<String> getLv() {
        return lv; }

        @FXML
    private void RemoveButton(){

        String selected = lv.getSelectionModel().getSelectedItem();
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        lv.getItems().remove(selected);  }

}
