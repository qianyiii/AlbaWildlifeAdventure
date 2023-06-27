module com.qianyi.albawildlifeadventure {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.qianyi.albawildlifeadventure to javafx.fxml;
    exports com.qianyi.albawildlifeadventure;
}