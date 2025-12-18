package org.akash.validator.views;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.akash.validator.controller.Controller;

import java.io.IOException;

public class ViewFactory {
    private final StringProperty slectedmenuIteam;
    private AnchorPane validator;
    private AnchorPane test;
    public ViewFactory(){
        this.slectedmenuIteam=new SimpleStringProperty("");
    }
    public StringProperty getSlectedmenuIteam() {
        return slectedmenuIteam;
    }
    public AnchorPane getValidator(){
        if(validator == null){
            try {
                validator = new FXMLLoader(getClass().getResource("/fxml/validator.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return validator;
    }
    public AnchorPane getTest(){
        if(test == null){
            try {
                test = new FXMLLoader(getClass().getResource("/fxml/test.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return test;
    }
    public void showWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/validator.fxml"));
        Controller controller=new Controller();
        loader.setController(controller);
        Scene scene=null;
        try {
            scene=new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage=new Stage();
        stage.setTitle("Validator");
        stage.setScene(scene);
        stage.show();
    }
}
