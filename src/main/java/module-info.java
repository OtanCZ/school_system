module com.src.schoolsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.src.schoolsystem to javafx.fxml;
    exports com.src.schoolsystem;
}