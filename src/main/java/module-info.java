module idata2001.waragames {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    // Need to open the ui-package for JavaFX
    opens idatx2001v.obligthree.cardgame.ui to javafx.fxml, javafx.graphics;
    // Need to open the root-package for "everyone" because JUnit5 uses reflection.
    opens idatx2001v.obligthree.cardgame;

    exports idata2001.wargames.ui;
    exports idata2001.wargames.model;
    opens idata2001.wargames.ui;
}