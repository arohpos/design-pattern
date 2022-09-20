package main.factoryMethod;

import main.factoryMethod.framework.Factory;
import main.factoryMethod.framework.Product;
import main.factoryMethod.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Alice");
		Product card2 = factory.create("Bob");
		Product card3 = factory.create("Chloe");
		card1.use();
		card2.use();
		card3.use();
	}
}
