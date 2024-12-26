module com.task6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.task6 to javafx.fxml;
    exports com.task6;
}