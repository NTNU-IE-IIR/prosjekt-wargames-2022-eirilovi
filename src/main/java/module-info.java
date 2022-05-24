/**
 * Creates a module for the application
 */
module idata2001.wargames {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    opens idata2001.wargames.ui to javafx.fxml, javafx.graphics;
    opens idata2001.wargames;

    exports idata2001.wargames;
    exports idata2001.wargames.model;
    opens idata2001.wargames.model;
}