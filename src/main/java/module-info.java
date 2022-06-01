module com.example.swipe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swipe to javafx.fxml;
    exports com.example.swipe;
}