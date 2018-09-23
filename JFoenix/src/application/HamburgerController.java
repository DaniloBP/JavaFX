package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import com.jfoenix.transitions.hamburger.HamburgerNextArrowBasicTransition;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;


public class HamburgerController implements Initializable {
	
	 @FXML
	 private JFXHamburger hamburger1;
	 @FXML
	 private JFXHamburger hamburger2;
	 @FXML
	 private JFXHamburger hamburger3;
	 @FXML
	 private JFXHamburger hamburger4;
	 
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		HamburgerSlideCloseTransition transition1 = new HamburgerSlideCloseTransition(hamburger1);
		transition1.setRate(-1);		
		hamburger1.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
			//Quando o RATE for 1 após o click do mouse ficará -1 
			//e quando for -1 ficará 1, pois -1 * -1 = +1.
			transition1.setRate(transition1.getRate() * (-1) ); 	//Abre ou fecha o hamburger ao clickar.
			transition1.play();
		});
		
		HamburgerBasicCloseTransition transition2 = new HamburgerBasicCloseTransition(hamburger2);
		transition2.setRate(-1);
		hamburger2.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
			//Quando o RATE for 1 após o click do mouse ficará -1 
			//e quando for -1 ficará 1, pois -1 * -1 = +1.
			transition2.setRate(transition2.getRate() * (-1) ); 	//Abre ou fecha o hamburger ao clickar.
			transition2.play();
		});
		
		HamburgerBackArrowBasicTransition transition3 = new HamburgerBackArrowBasicTransition(hamburger3);
		transition3.setRate(-1);
		hamburger3.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
			//Quando o RATE for 1 após o click do mouse ficará -1 
			//e quando for -1 ficará 1, pois -1 * -1 = +1.
			transition3.setRate(transition3.getRate() * (-1) ); 	//Abre ou fecha o hamburger ao clickar.
			transition3.play();
		});
		
		HamburgerNextArrowBasicTransition transition4 = new HamburgerNextArrowBasicTransition(hamburger4);
		transition4.setRate(-1);
		hamburger4.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
			//Quando o RATE for 1 após o click do mouse ficará -1 
			//e quando for -1 ficará 1, pois -1 * -1 = +1.
			transition4.setRate(transition4.getRate() * (-1) ); 	//Abre ou fecha o hamburger ao clickar.
			transition4.play();
		});
	}
	
}
