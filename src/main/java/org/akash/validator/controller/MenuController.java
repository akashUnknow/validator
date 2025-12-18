package org.akash.validator.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.akash.validator.model.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    public Button validator_btn;
    public Button test_btn1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();


    }

    private void addListeners() {
        validator_btn.setOnAction(e->onValidator());
        test_btn1.setOnAction(e->onTest());
    }

    private void onValidator() {
        Model.getInstance().getViewFactory().getSlectedmenuIteam().set("Validator"); // ✅ Set the value
    }

    private void onTest() {
        Model.getInstance().getViewFactory().getSlectedmenuIteam().set("Test"); // ✅ Set the value
    }
}