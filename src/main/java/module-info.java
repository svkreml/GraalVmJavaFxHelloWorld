module GraalVmJavaFxHelloWorld {
   // requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    // export Application subclass's package to at least javafx.graphics
    exports svkreml.GraalVmJavaFxHelloWorld to javafx.graphics;

    // open any FXML controller class' packages to at least javafx.fxml
    // ...
}