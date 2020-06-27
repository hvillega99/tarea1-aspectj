package gui;

import java.util.Observable;
import java.util.Observer;

import application.Main;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;

public class Controller implements Observer {
	
	@Override
	public void update(Observable arg0, Object arg1) {
		
		Data data = (Data)arg1;
		
		System.out.println("El color cambió a " + data.getName());
		Main.root.setBackground(new Background(new BackgroundFill(data.getColor(), CornerRadii.EMPTY, Insets.EMPTY)));
	}

}
