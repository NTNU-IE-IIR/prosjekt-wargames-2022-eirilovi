package idata2001.wargames.ui;

import idata2001.wargames.model.Unit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {

    @FXML
    private TableColumn<Unit, Integer> health;

    @FXML
    private TableView<Unit> leftArmy;

    @FXML
    private TableView<Unit> rightArmy;

    @FXML
    private TableColumn<Unit, String> name;

    @FXML
    private Button startGame;

    @FXML
    private TableColumn<Unit, String> unit;

    @FXML
    private Button loadArmy;

    @FXML
    private Button resetButton;

    /**
     * Starts a simulation between the two armies
     * @param event initiates the simulation
     */
    public void startGame(ActionEvent event) {
       // Battle battle = new Battle();
        //battle.simulate();
    }
}