module com.example.hellobp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellobp to javafx.fxml;
    exports com.example.hellobp;
}