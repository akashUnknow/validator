module org.akash.validator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.base;
    requires javafx.graphics;

    opens org.akash.validator to javafx.fxml;
    opens org.akash.validator.controller to javafx.fxml;  // Add this line
    exports org.akash.validator;
    exports org.akash.validator.controller;  // Add this line
}