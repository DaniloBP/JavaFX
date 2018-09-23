package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXSnackbar;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;


public class SnackbarController implements Initializable {
	 
	@FXML
    private AnchorPane rootPane;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		final JFXSnackbar snackbar = new JFXSnackbar(rootPane);
		
		EventHandler handler = new EventHandler() {

			@Override
			public void handle(Event event) {
				System.out.println("Closing ...");	
				snackbar.unregisterSnackbarContainer(rootPane);
			}
		};
		//snackbar.show("Seja Bem-vindo(a)", 5000);  //O tempo deve ser posto em MILIsegundos!
		snackbar.show("Seja Bem-vindo(a)", "OK", 15000, handler);
	}
	
}
