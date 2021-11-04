package controllers;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;

public class MainController {
	
	@FXML private RightPaneController rightController;
	@FXML private LeftPaneController leftController;

	// Event Listener on Button.onAction
	@FXML public void doLeft(ActionEvent event) {
		leftController.randomize();
	}
	
	// Event Listener on Button.onAction
	@FXML public void doRight(ActionEvent event) {
		rightController.randomize();
	}
	
	@FXML private void initialize() {
		leftController.injectRightPaneController(rightController);
		rightController.injectLeftPaneController(leftController);
	}
}
