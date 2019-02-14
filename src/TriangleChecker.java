import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TriangleChecker extends Application {
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		//start-up window
		//-----------------------------------------------
		Scene scene = setStart(primaryStage);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private Scene setStart(Stage primaryStage) throws Exception {
		//primaryStage adjustment
		//-----------------------------------------------
		primaryStage.setResizable(false);
		primaryStage.sizeToScene();
		primaryStage.setTitle("JavaFX application");
		primaryStage.centerOnScreen();

		//FXML adjustment
		//-----------------------------------------------
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("TriangleChecker.fxml"));
		Parent fxmlMainWindow = null;
		try {
			fxmlMainWindow = fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(fxmlMainWindow != null) {
			return new Scene(fxmlMainWindow);
		}
		else {
			throw new Exception();
		}
	}
}