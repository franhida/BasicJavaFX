package controller;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class Controller {
	@FXML
	private ImageView imageView;
	@FXML
	private Circle circle;

	@FXML
	public void setBlur() {
		imageView.setEffect(new GaussianBlur(10));
	}

	@FXML
	public void handleClose() {
		System.exit(0);
	}

	@FXML
	public void setClip() {
		circle = new Circle((imageView.getFitWidth()) * 0.15);
		circle.setCenterX(90);
		circle.setCenterY(75);
		imageView.setClip(circle);

	}
}
