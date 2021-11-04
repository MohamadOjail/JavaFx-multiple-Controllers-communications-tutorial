package controllers;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import java.util.Random;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.layout.VBox;

public class RightPaneController {
	@FXML private VBox right;
	@FXML private Label rightLabel;
	@FXML private Button rightBtn;
	
	private LeftPaneController leftPaneController;

	// Event Listener on Button[#rightBtn].onAction
	@FXML public void rightDo(ActionEvent event) {
		leftPaneController.randomize();
	}
	
	public void randomize() {
		Random obj = new Random();
		int rand_num = obj.nextInt(0xffffff + 1);
		// format it as hexadecimal string and print
		String colorCode = String.format("#%06x", rand_num);
		
		right.setStyle("-fx-background-color: " + colorCode);
		rightLabel.setText(colorCode);
		rightLabel.setStyle("-fx-background-color: white");
	}

	public void injectLeftPaneController(LeftPaneController leftPaneController) {
		this.leftPaneController = leftPaneController;
	}
}
