import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ResourceBundle;

public class TriangleCheckerController {

	private ObservableList<TrianglePropertyTable> allInformation;

	private String[] triangleInformation = {"Triangle", "Acute-angled triangle", "Right-angled triangle",
	"Obtuse-angled triangle", "Scalenous triangle", "Isosceles triangle", "Equilateral triangle"};

	@FXML
	private TextField side1TextField;

	@FXML
	private TextField side2TextField;

	@FXML
	private TextField side3TextField;

	@FXML
	private TextField angle1TextField;

	@FXML
	private TextField angle2TextField;

	@FXML
	private TextField angle3TextField;

	@FXML
	private Label serviceInformationLabel;

	@FXML
	private Button checkButton;

	@FXML
	private TableView<TrianglePropertyTable> mainTableView;

	@FXML
	private TableColumn<TrianglePropertyTable, String> informationTableColumn;

	@FXML
	private TableColumn<TrianglePropertyTable, String> propertiesTableColumn;
	@FXML
	void initialize() {
		this.allInformation = FXCollections.observableArrayList();
		for(String string : this.triangleInformation) {
			this.allInformation.add(new TrianglePropertyTable(string, ""));
		}
		this.checkButton.setOnAction(buttonEvent -> this.onCheckButtonPressed());
	}

	private void onCheckButtonPressed()
	{
		this.mainTableView.setItems(this.allInformation);
		this.informationTableColumn.setCellValueFactory(new PropertyValueFactory<>("information"));
		this.propertiesTableColumn.setCellValueFactory(new PropertyValueFactory<>("properties"));

		Double side1 = Double.valueOf(this.side1TextField.getText());
		Double side2 = Double.valueOf(this.side2TextField.getText());
		Double side3 = Double.valueOf(this.side3TextField.getText());

		Double angle1 = Double.valueOf(this.angle1TextField.getText());
		Double angle2 = Double.valueOf(this.angle2TextField.getText());
		Double angle3 = Double.valueOf(this.angle3TextField.getText());

		
	}

}
