package EcommerceLoginJavafx;

import java.net.URL;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EcommerceJavafxLogin extends Application {

	public static void main(String[] args) {
		Application.launch(EcommerceJavafxLogin.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		URL fxmlurl = Paths
				.get("C:/Users/91853/eclipse-workspace/Ecommerce_javafx/src/EcommerceLoginJavafx//loginscreen.fxml")
				.toUri().toURL();
		Parent actorGroup = FXMLLoader.load(fxmlurl);
		stage.setTitle("Login Form");
		Scene scene = new Scene(actorGroup, 600, 400);
		stage.setScene(scene);
		stage.show();

	}

}
