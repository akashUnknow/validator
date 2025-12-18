package org.akash.validator.controller;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import org.akash.validator.model.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public BorderPane client_parent;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getSlectedmenuIteam().addListener((observable, oldValue, newValue) -> {;
            switch (newValue){
                case "Validator"-> client_parent.setCenter(Model.getInstance().getViewFactory().getValidator());
                case "Test"-> client_parent.setCenter(Model.getInstance().getViewFactory().getTest());
            }
        });
    }
}
