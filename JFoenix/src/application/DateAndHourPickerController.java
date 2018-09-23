package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class DateAndHourPickerController implements Initializable{
	
    @FXML
    private Label dateLabel;
    @FXML
    private Label hourLabel;
    @FXML
    private JFXDatePicker datePicker;
    @FXML
    private JFXTimePicker hourPicker;
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.hourPicker.setIs24HourView(true);
	}

}
