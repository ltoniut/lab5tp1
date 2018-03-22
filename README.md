Nombre del repositorio: https://github.com/ltoniut/lab5tp1

Explicaci�n del sistema:

Tengo 4 clases. Main, una BeerHouse, BeerProducer y BeerConsumer. BeerProducer y BeerConsumer son Threads que corren simult�neamente,
llamando a los m�todos de BeerHouse AddStock (Agrega cerveza) y RemoveStock (Remueve cerveza) respectivamente. BeerConsumer, adem�s de la
BeerHouse a la que acceder�, recibe como par�metro la cantidad de cerveza a consumir por un cliente, una a la vez. BeerProducer, adem�s de
la BeerHouse, recibe como par�metro la cantidad de botellas de cerveza que provee cada vez que accede a su BeerHouse, la cual tiene un l�mite
de stock (configurado en 100) que no puede ser superado cuando se llama al m�todo AddStock.



1) Cuantos consumidores son necesarios para llegar a 0 el stock?
Aunque mi sistema incluye como variables la cantidad de cerveza que agrega la f�brica por vez,
dado suficiente tiempo es posible que un cliente baste para acabar con el stock. Sin embargo,
se debe asignar al mismo un gran n�mero de cervezas a consumir.

2) Bloques synchronized por que deben serlos?
Para que no hayan varios Threads intentando acceder simultaneamente a un recurso compartido y no se ejecuten los m�todos a la vez.

3) Explicar el recurso compartido.
El recurso compartido es el objeto BeerHouse. Los elementos que quieren acceder a la misma son BeerProducer (Que quiere ejecutar AddStock),
y BeerConsumer (Que intenta ejecutar RemoveStock)

4) Explicar las 3 formas de instanciar un Thread.
- Crear una clase que implemente la interfaz Runnable.
- Crear una clase que implemente la interfaz Callable.
- Crear una clase que extienda Thread