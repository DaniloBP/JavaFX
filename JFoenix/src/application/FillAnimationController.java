package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.transitions.JFXFillTransition;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class FillAnimationController implements Initializable {

	@FXML
    private AnchorPane rootPane;
	
	@FXML
    private JFXButton starBtn;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
    @FXML
    void fill(ActionEvent event) {
    	
    	JFXFillTransition transition = new JFXFillTransition();
    	transition.setDuration(Duration.millis(7000));
    	transition.setRegion(rootPane);
//    	transition.setRegion(starBtn);
    	transition.setFromValue(Color.WHITE);
    	transition.setToValue(Color.BLACK);
    	transition.play();
    	JFXFillTransition transition2 = new JFXFillTransition(Duration.millis(5000), rootPane, Color.BLACK, Color.ALICEBLUE);
    	
    	transition.setOnFinished((e) -> {
    		transition2.play();
    	});
    }	

}
