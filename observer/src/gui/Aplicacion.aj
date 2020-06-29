import java.awt.Color;

import application.Main;

aspect Aplicacion{
     String color;
     
	pointcut datos(): call(* *.notifyObservers(*)); 
    after() : datos() {
    	color=Main.color;
    	if(color=="Verde") {
    		System.out.println("Mezcla con Rojo: Amarillo");
    		System.out.println("Mezcla con Azul: Celeste");
    	}
    	else if (color=="Azul") {
    		System.out.println("Mezcla con Verde: Celeste");
    		System.out.println("Mezcla con Rojo: Magenta");
    	}
    	else if(color=="Rojo") {
    		System.out.println("Mezcla con Verde: Amarillo");
    		System.out.println("Mezcla con Azul: Magenta");
    	}
    	}
}