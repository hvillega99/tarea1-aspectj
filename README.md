# tarea1-aspectj
La funcionalidad que se implementó mediante el uso de Aspectos, fue el de mostrar ciertas mezclas respecto al color que elige el usuario
en la interfaz y los colores resultantes debido a esa mezcla.

Por ejemplo, si el usuario elige el color azul, en la consola se le mostrará
ciertas mezclas con ese color en la consola, tal y como se muestra en la siguiente imagen:
<img width="393" alt="2020-06-30 (2)" src="https://user-images.githubusercontent.com/66217847/86188356-fd77bc00-bb03-11ea-9df4-cd4dffe75dfa.png">


El aspecto se lo llamo datos(), y éste se ejecutara DESPUÉS de que se llame a la función NotifyObserver():
<img width="427" alt="2020-06-30 (4)" src="https://user-images.githubusercontent.com/66217847/86188520-7b3bc780-bb04-11ea-9a1c-95ad1c658b6d.png">

Luego, en base a la variable "color" que se encuentra en el main y que guarda el color elegido por
el usuario,se presentaran las mezclas respectivas.
