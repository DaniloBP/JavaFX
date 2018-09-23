package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;


public class NavigationDrawerController implements Initializable {
	
	@FXML
	private JFXHamburger hamburger;	 
	@FXML
    private AnchorPane mainPane;
    @FXML
    private JFXDrawer drawer;	 
	 
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		try {
			VBox box = FXMLLoader.load(getClass().getResource("FXMLDrawerContent.fxml"));			
			drawer.setSidePane(box);
			
			for (Node node : box.getChildren()) {
				if (node.getAccessibleText() != null) {
					node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
						switch (node.getAccessibleText()) {
						case "Material_one":
							mainPane.setBackground(new Background(new BackgroundFill(Paint.valueOf("#4CAF50"), CornerRadii.EMPTY, Insets.EMPTY)));						
							break;
						case "Material_two":
							mainPane.setBackground(new Background(new BackgroundFill(Paint.valueOf("#0288D1"), CornerRadii.EMPTY, Insets.EMPTY)));						
							break;
						case "Material_three":
							mainPane.setBackground(new Background(new BackgroundFill(Paint.valueOf("#C21858"), CornerRadii.EMPTY, Insets.EMPTY)));						
							break;
						case "Material_four":
							mainPane.setBackground(new Background(new BackgroundFill(Paint.valueOf("#4E342E"), CornerRadii.EMPTY, Insets.EMPTY)));						
							break;
						case "Material_five":
							System.exit(0);						 
						}
					});
				}
			}
			
			HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
			transition.setRate(-1);  
			
			hamburger.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
				//Quando o RATE for 1 após o click do mouse ficará -1 
				//e quando for -1 ficará 1, pois -1 * -1 = +1.
				transition.setRate(transition.getRate() * (-1) ); 	//Abre ou fecha o hamburger ao clickar.
				transition.play();
				
				if (drawer.isOpened()) {
					drawer.close();
				} else {
					drawer.open();
				}			
			});		
		} catch (IOException e1) {
			e1.printStackTrace();
		}		
		
	}
	
}
