package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXNodesList;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class FloatingButtonsController implements Initializable {

	@FXML
	private AnchorPane mainPane;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		JFXButton rootBtn = new JFXButton("Root");
		rootBtn.setButtonType(JFXButton.ButtonType.RAISED);
		
		JFXButton childBtn1 = new JFXButton("Child 1");
		childBtn1.setButtonType(JFXButton.ButtonType.RAISED);
		
		JFXButton childBtn2 = new JFXButton("Child 2");
		childBtn2.setButtonType(JFXButton.ButtonType.RAISED);
		
		JFXNodesList nodeList = new JFXNodesList();
		nodeList.setSpacing(10d);
		nodeList.addAnimatedNode(rootBtn);
		nodeList.addAnimatedNode(childBtn1);
		nodeList.addAnimatedNode(childBtn2);
		
		JFXButton grandChildBtn1 = new JFXButton("GrandChild 1");
		childBtn1.setButtonType(JFXButton.ButtonType.RAISED);
		
		JFXButton grandChildBtn2 = new JFXButton("GrandChild 2");
		childBtn2.setButtonType(JFXButton.ButtonType.RAISED);
		
		JFXButton grandChildBtn3 = new JFXButton("GrandChild 3");
		childBtn2.setButtonType(JFXButton.ButtonType.RAISED);
		
		JFXNodesList nodeList1 = new JFXNodesList();
		nodeList1.setSpacing(10d);
		nodeList1.addAnimatedNode(grandChildBtn1);
		nodeList1.addAnimatedNode(grandChildBtn2);
		nodeList1.addAnimatedNode(grandChildBtn3);
		
		nodeList.addAnimatedNode(nodeList1);
		
		mainPane.getChildren().add(nodeList);
		mainPane.setPrefSize(500, 400);
		
		AnchorPane.setLeftAnchor(nodeList, mainPane.getPrefWidth()/2);
	}

}
