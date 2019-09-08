package notiz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class NotizEditController {
	
	@FXML
	private TextArea editTextArea;
	
	@FXML
	private Button okEditButton;
	
	private	Stage stage;
	
	private Notiz notiz;
	
	public NotizEditController() {
				
	}

    public void setPrevStage(Stage stage){
         this.stage = stage;
    }
	
    public void setNotiz(Notiz notiz) {
    	this.notiz = notiz;
        editTextArea.setText(notiz.getText());
    }
	
    @FXML
	private void initialize() {
    	
    	okEditButton.setOnAction((event) -> {
    		notiz.setText(editTextArea.getText());
    		stage.close();
		});
    }
}

