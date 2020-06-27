package gui;

import java.util.Observable;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Window extends Observable{
	private Color color;
    private BorderPane root;
	private Data data;
	
	public Window() {
		root = new BorderPane();
		data=new Data();
		createScene();
	}
	
	private void createScene() {
		Button btnColor1 = new Button("Verde");
		Color color1 = Color.GREEN;
		Button btnColor2 = new Button("Azul");
		Color color2 = Color.BLUE;
		Button btnColor3 = new Button("Naranja");
		Color color3 = Color.ORANGE;
		
		HBox hbox = new HBox(5);
		hbox.getChildren().addAll(btnColor1,btnColor2,btnColor3);
		root.setCenter(hbox);
		hbox.setAlignment(Pos.CENTER);
		
		btnColor1.setOnAction(e->{
			data.setColor(color1);
			data.setName(btnColor1.getText());
			setChanged();
	        notifyObservers(data);
		});
		
		btnColor2.setOnAction(e->{
			data.setColor(color2);
			data.setName(btnColor2.getText());
			setChanged();
	        notifyObservers(data);
		});
		
		btnColor3.setOnAction(e->{
			data.setColor(color3);
			data.setName(btnColor3.getText());
			setChanged();
	        notifyObservers(data);
		});
	}

	public BorderPane getRoot() {
		return root;
	}

}
