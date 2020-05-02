package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.shape.Circle;

public class RaceController {

	@FXML
	private TextField tfNumber;

	@FXML
	private Label labelTime;

	@FXML
	private Circle circleOne;

	@FXML
	private Circle circleTwo;

	@FXML
	private TextField timeArrayList;

	@FXML
	private TextField timeLinkedList;

	@FXML
	private TextField timeABB;

	@FXML
	private ToggleGroup algo;

	@FXML
	private ToggleGroup mode;

	@FXML
	private TextField countArray;

	@FXML
	private TextField countLinked;

	@FXML
	private TextField countABB;

	@FXML
	private ProgressBar pbArray;

	@FXML
	private ProgressBar pbLinked;

	@FXML
	private ProgressBar pbABB;

	public void initialize() {

	}

	@FXML
	void restart(ActionEvent event) {

	}

	@FXML
	void run(ActionEvent event) {

	}

	

}
