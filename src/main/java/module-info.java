module org.akash.validator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.base;
    requires javafx.graphics;


    opens org.akash.validator to javafx.fxml;
    exports org.akash.validator;
}