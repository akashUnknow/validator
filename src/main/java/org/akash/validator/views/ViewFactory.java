package org.akash.validator.views;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Client.fxml"));
        Scene scene=null;
        try {
            scene=new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage=new Stage();
        stage.setTitle("Validator");
        stage.setScene(scene);
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        double screenWidth = bounds.getWidth();
        double screenHeight = bounds.getHeight();
        if (screenWidth <= 1600) {
            stage.setX(bounds.getMinX());
            stage.setY(bounds.getMinY());
            stage.setWidth(bounds.getWidth());
            stage.setHeight(bounds.getHeight());
        } else {
            double newWidth = screenWidth * 0.70;
            double newHeight = screenHeight * 0.80;
            stage.setWidth(newWidth);
            stage.setHeight(newHeight);
            stage.setX(bounds.getMinX() + (screenWidth - newWidth) / 2);
            stage.setY(bounds.getMinY() + (screenHeight - newHeight) / 2);
        }
        stage.show();
    }
}