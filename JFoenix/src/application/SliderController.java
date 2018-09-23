package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXSlider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class SliderController implements Initializable, ChangeListener {
	
	@FXML
    private AnchorPane mainPane;

    @FXML
    private JFXSlider red;

    @FXML
    private JFXSlider green;

    @FXML
    private JFXSlider blue;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		red.valueProperty().addListener(this);
		green.valueProperty().addListener(this);
		blue.valueProperty().addListener(this);
		
		Color color = createColor();
		this.mainPane.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}

	@Override
	public void changed(ObservableValue arg0, Object arg1, Object arg2) {
		
		Color color = createColor();
		this.mainPane.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	private Color createColor() {
		
		Double r = this.red.getValue(); 
		Double g = this.green.getValue();
		Double b = this.blue.getValue();
		
		Color color = Color.rgb(r.intValue(), g.intValue(), b.intValue());
		
		return color;
	}

}
