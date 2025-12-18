package org.akash.validator.controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

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
    }

    private void onTest() {
    }
}
