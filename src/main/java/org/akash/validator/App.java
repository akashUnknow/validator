package org.akash.validator;

import javafx.application.Application;
import javafx.stage.Stage;
import org.akash.validator.model.Model;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Model.getInstance().getViewFactory().showWindow();
    }
}
