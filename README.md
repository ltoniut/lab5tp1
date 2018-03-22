Nombre del repositorio: https://github.com/ltoniut/lab5tp1

Explicación del sistema:

Tengo 4 clases. Main, una BeerHouse, BeerProducer y BeerConsumer. BeerProducer y BeerConsumer son Threads que corren simultáneamente,
llamando a los métodos de BeerHouse AddStock (Agrega cerveza) y RemoveStock (Remueve cerveza) respectivamente. BeerConsumer, además de la
BeerHouse a la que accederá, recibe como parámetro la cantidad de cerveza a consumir por un cliente, una a la vez. BeerProducer, además de
la BeerHouse, recibe como parámetro la cantidad de botellas de cerveza que provee cada vez que accede a su BeerHouse, la cual tiene un límite
de stock (configurado en 100) que no puede ser superado cuando se llama al método AddStock.



1) Cuantos consumidores son necesarios para llegar a 0 el stock?
Aunque mi sistema incluye como variables la cantidad de cerveza que agrega la fábrica por vez,
dado suficiente tiempo es posible que un cliente baste para acabar con el stock. Sin embargo,
se debe asignar al mismo un gran número de cervezas a consumir.

2) Bloques synchronized por que deben serlos?
Para que no hayan varios Threads intentando acceder simultaneamente a un recurso compartido y no se ejecuten los métodos a la vez.

3) Explicar el recurso compartido.
El recurso compartido es el objeto BeerHouse. Los elementos que quieren acceder a la misma son BeerProducer (Que quiere ejecutar AddStock),
y BeerConsumer (Que intenta ejecutar RemoveStock)

4) Explicar las 3 formas de instanciar un Thread.
- Crear una clase que implemente la interfaz Runnable.
- Crear una clase que implemente la interfaz Callable.
- Crear una clase que extienda Thread