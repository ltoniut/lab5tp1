package start;

public class BeerConsumer extends Thread {
    private BeerHouse house;
    private int quantity;

    public BeerConsumer(BeerHouse h, int q) {
	house = h;
	this.quantity = q;
    }

    public void run() {
	int i;

	for (i = 1; i <= quantity && house.getStock() > 0; i++) {
		    house.RemoveStock();
		}
    }
}
