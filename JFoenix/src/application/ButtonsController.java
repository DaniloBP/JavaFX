package application;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ButtonsController {
	
	@FXML
    private JFXButton flatBtn;

    @FXML
    private JFXButton raisedBtn;

    @FXML
    private JFXButton disabledBtn;

    
    @FXML
    void raisedBtnAction(ActionEvent event) {
    	if(this.disabledBtn.isDisabled()) {
    			disabledBtn.setDisable(false);
    	}else {
    		this.disabledBtn.setDisable(true);
    	}
    }
}

