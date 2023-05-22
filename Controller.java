package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.model.DataStorage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //Initializable class
    //List(observable)
    //get set items from list
    //manage nodes and controller

    @FXML
    private TextField emailText;

    ObservableList<String> l;
    @FXML
    private void RegisterButton(){

        DataStorage ds = DataStorage.getInstance();
        ds.setEmail(emailText.getText());
        emailText.setText("");
        l.add(ds.getEmail());  }

    @FXML
    private void ViewEmailButton(ActionEvent event) throws IOException {

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/second.fxml"));
        Parent root =  loader.load();
        SecondController controller = loader.getController();
        Scene scene = new Scene(root);
        controller.getLv().setItems(l);
        stage.setScene(scene);  }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        l = FXCollections.observableArrayList();
    }
}


