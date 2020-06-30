# tarea1-aspectj
La funcionalidad que se implementó mediante el uso de Aspectos, fue el de mostrar ciertas mezclas respecto al color que elige el usuario
en la interfaz y los colores resultantes debido a esa mezcla.
Por ejemplo, si el usuario elige el color azul, en la consola se le mostrará
ciertas mezclas con ese color en la consola, tal y como se muestra en la siguiente imagen:



El aspecto se lo llamo datos(), y éste se ejecutara DESPUÉS de que se
llame a la función NotifyObserver(). Luego, en base a la variable "color" que se encuentra en el main y que guarda el color elegido por
el usuario,se presentaran las mezclas respectivas.
