import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Player {

	private String name;
	private String team;
	private int value;
	private TextField price;
	private Button buy;
	private ChoiceBox<String> choice;
	
	public Player(String name, String team, int value) {
		this.name = name;
		this.team = team;
		this.value = value;
		price = new TextField();
		buy = new Button("Buy");
		buy.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("Player: " + name + " goes to -> " + ((String) choice.getValue()));
			}
		});
		choice = new ChoiceBox<String>();
		choice.setItems(FXCollections.observableArrayList("Team 1","Team 2","Team 3"));
	}

	public ChoiceBox<String> getChoice() {
		return choice;
	}

	public void setChoice(ChoiceBox<String> choice) {
		this.choice = choice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TextField getPrice() {
		return price;
	}

	public void setPrice(TextField price) {
		this.price = price;
	}

	public Button getBuy() {
		return buy;
	}

	public void setBuy(Button buy) {
		this.buy = buy;
	}
	
	
}
