module com.mycompany.textjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.textjavafx to javafx.fxml;
    exports com.mycompany.textjavafx;
}
