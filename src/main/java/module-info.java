module com.example.testngmain {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;


    opens com.example.testngmain to javafx.fxml;
    exports com.example.testngmain;
}