package ojail.mohamad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("resources/Main.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Developed by: Mohamad Ojail - v0.1");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
