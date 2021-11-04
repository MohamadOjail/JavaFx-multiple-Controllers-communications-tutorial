package controllers;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import java.util.Random;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.layout.VBox;

public class LeftPaneController {
	
	@FXML private VBox left;
	@FXML private Label leftLabel;
	@FXML private Button leftBtn;
	
	

	// Event Listener on Button[#leftBtn].onAction
	@FXML public void leftDo(ActionEvent event) {
		rightPaneController.randomize();
	}
	
	public void randomize() {
		Random obj = new Random();
		int rand_num = obj.nextInt(0xffffff + 1);
		// format it as hexadecimal string and print
		String colorCode = String.format("#%06x", rand_num);
		
		left.setStyle("-fx-background-color: " + colorCode);
		leftLabel.setText(colorCode);
		leftLabel.setStyle("-fx-background-color: white");
	}
	

	private RightPaneController rightPaneController;
	
	public void injectRightPaneController(RightPaneController rightPaneController) {
		this.rightPaneController = rightPaneController;
	}
}
