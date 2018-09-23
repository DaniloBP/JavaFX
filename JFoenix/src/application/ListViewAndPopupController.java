package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXPopup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class ListViewAndPopupController implements Initializable {

	@FXML
	private AnchorPane mainPane;
	@FXML
    private JFXListView<Label> listView;	
	@FXML
    private JFXButton expantionBtn;
    @FXML
    private JFXButton addNewBtn;
    @FXML
    private JFXPopup popup;

    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
    	for (int i = 0; i < 4; i++) {
			Label lbl = new Label("Item " + i);
			
			try {
				lbl.setGraphic(new ImageView(new Image(new FileInputStream("C:\\Users\\Coordenação\\Documents\\COURSE\\git\\JavaFX\\Emoji.png"))));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			listView.getItems().add(lbl);
		}    	
    	//listView.verticalGapProperty().add(20);
    	initPopup();		
	}
    
    @FXML
    void addNew(ActionEvent event) {

    }

    @FXML
    void load(ActionEvent event) {
    	
    	if (listView.isExpanded()) {
    		listView.setExpanded(false);
    		listView.depthProperty().set(0);  //DESATIVA o efeito visual 3D na lista.
		} else {
			listView.setExpanded(true);
	    	listView.depthProperty().set(1);  //ATIVA o efeito visual 3D na lista.
		}    	
    }	
    
    @FXML
    void showPopup(MouseEvent event) {
    	popup.show(listView, JFXPopup.PopupVPosition.TOP, JFXPopup.PopupHPosition.LEFT);
    	//popup.show(mainPane, event.getX(), event.getY());    	
    }
    
    private void initPopup() {
    	    	
    	JFXButton btn1 = new JFXButton("Task 1");
    	JFXButton btn2 = new JFXButton("Task 2");
    	JFXButton btn3 = new JFXButton("Task 3");
    	
    	btn1.setPadding(new Insets(10));
    	btn2.setPadding(new Insets(10));
    	btn3.setPadding(new Insets(10));
    	
    	VBox box = new VBox(btn1, btn2, btn3);
    	
    	popup = new JFXPopup(box);
    	
    	//popup.setPopupContent();
    }
	
}
