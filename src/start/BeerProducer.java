package start;

import java.util.ArrayList;

public class BeerProducer extends Thread {
    // Produce

    ArrayList<String> Cervezas;

    private BeerHouse house;
    private int rate;

    public BeerProducer(BeerHouse bh, int r) {
	this.house = bh;
	this.rate = r;
    }

    public void run() {    	
    	while (house.getStock() > 0) {
		    house.AddStock(rate);
		}
    	this.interrupt();
    }
    
}
