module hu.petrik.adatbazisjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens hu.petrik.adatbazisjavafx to javafx.fxml;
    exports hu.petrik.adatbazisjavafx;
}