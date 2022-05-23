module idata2001.waragames {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    // Need to open the ui-package for JavaFX
    opens idata2001.wargames.ui to javafx.fxml, javafx.graphics;
    // Need to open the root-package for "everyone" because JUnit5 uses reflection.
    opens idata2001.wargames;

}