package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXRippler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;

public class RipplerController implements Initializable {

    @FXML
    private AnchorPane mainPane;
    @FXML
    private Pane frontPane;
    @FXML
    private Label dgeoLabel;
    
	    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		JFXRippler rippler = new JFXRippler(frontPane);
		JFXRippler rippler1 = new JFXRippler(dgeoLabel);
		
		rippler.setRipplerFill(Paint.valueOf("#252525"));
		rippler.setMaskType(JFXRippler.RipplerMask.RECT);
		
		rippler1.setRipplerFill(Paint.valueOf("#96c988"));
		rippler1.setMaskType(JFXRippler.RipplerMask.RECT);
		//rippler.setMaskType(JFXRippler.RipplerMask.CIRCLE);
		
		mainPane.getChildren().add(rippler);
		mainPane.getChildren().add(rippler1);
	}

}
