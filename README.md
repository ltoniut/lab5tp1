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