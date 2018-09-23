package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class LoginController implements Initializable{
	
	@FXML
    private JFXTextField usernameTxt;

    @FXML
    private JFXPasswordField passwordField;

    @FXML
    private JFXButton loginBtn;

    @FXML
    private JFXButton cancelBtn;

    @FXML
    private Label exitLabel;
    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
    void exitLabelAction(MouseEvent event) {
		System.out.println("Fechando Login ...");	
		System.exit(0);
    }
	
	@FXML
    void mouseHovering(MouseEvent event) {
		//this.exitLabel.onMouseEnteredProperty();
    }
	
	@FXML
    void cancelBtnAction(ActionEvent event) {
    	clearFields();
    }

    @FXML
    void lognBtnAction(ActionEvent event) {
    	System.out.println("Username -->  " + this.usernameTxt.getText());
    	System.out.println("Senha -->  " + this.passwordField.getText()); 
    	
    	clearFields();
    }	
    
    private void clearFields() {
    	this.usernameTxt.clear();
    	this.passwordField.clear();
    }
    
}
