package start;

public class BeerHouse {
    private int stock;

    int top = 100;

    public BeerHouse(int s) {
    	this.stock = s;
    }

    public synchronized void AddStock(int s) {
    	// En BeerProducer, el chequeo de getStock() != 0 se ejecutaba demasiado lento y nunca llegaba a ser verdadero
    	// Por ese motivo, repito la consulta en AddStock
    	
		if (this.stock + s <= top && this.stock != 0) {
		    this.stock = stock + s;
	
		    System.out.println("Agregamos cerveza. Stock actual es de " + stock);
		}
    }

    public int getStock() {
    	return stock;
    }

    public synchronized void RemoveStock() {
	if (this.stock > 0) {
	    this.stock--;

	    System.out.println("Stock actual es de " + stock);
	}
    }
}
