package notiz;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader myLoader = new FXMLLoader(getClass().getResource("NotizView.fxml"));
			AnchorPane root = (AnchorPane)myLoader.load();
			NotizController controller = (NotizController) myLoader.getController();	
				
			//setzen der atkuellen Stage im aktuellen Controller
			controller.setPrevStage(primaryStage);
			//setzen der mains im aktuellen Controller
			controller.setMain(this);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Notes FXML MENU");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
