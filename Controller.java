import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.shape.Line;

public class Controller {

	@FXML
	private Slider psx;
	@FXML
	private Slider psy;
	@FXML
	private Slider pkx;
	@FXML
	private Slider pky;
	@FXML
	private Line line = new Line (0.0, 0.0, 0.0, 0.0);
		
	@FXML
	private void initialize() {
		
		line.startXProperty().bind(psx.valueProperty());
		line.startYProperty().bind(psy.valueProperty());
		line.endXProperty().bind(pkx.valueProperty());
		line.endYProperty().bind(pky.valueProperty());		
		
	}	
}


