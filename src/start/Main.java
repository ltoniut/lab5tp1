package start;

public class Main {
    public static void main(String args[]) {
	BeerHouse house = new BeerHouse(50);
	BeerProducer producer = new BeerProducer(house, 1);
	BeerConsumer consumer1 = new BeerConsumer(house, 10);
	BeerConsumer consumer2 = new BeerConsumer(house, 15);
	BeerConsumer consumer3 = new BeerConsumer(house, 100);
	BeerConsumer consumer4 = new BeerConsumer(house, 100);
	BeerConsumer consumer5 = new BeerConsumer(house, 30);
	BeerConsumer consumer6 = new BeerConsumer(house, 30);

	producer.start();
	consumer1.start();
	consumer2.start();
	consumer3.start();
	consumer4.start();
	consumer5.start();
	consumer6.start();
    }
}
