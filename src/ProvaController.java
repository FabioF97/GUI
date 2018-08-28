import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ProvaController {
	
	@FXML private Label label;
	
	@FXML private Button createChampionship;
	
	public ProvaController() {
	}
	
	@FXML
    public void initialize() {
		label.setText("Funziona?");
    }
	
	@FXML
	protected void handlerButtonController(MouseEvent event) throws IOException {
		System.out.println("Campionato");
	}
	
	@FXML
	protected void handlerCreateChampionshipController(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("createChampionship.fxml"));
		Scene scene2 = new Scene(parent);
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(scene2);
		window.show();
	}

}
