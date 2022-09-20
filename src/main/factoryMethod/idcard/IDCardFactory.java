package main.factoryMethod.idcard;

import main.factoryMethod.framework.Factory;
import main.factoryMethod.framework.Product;

public class IDCardFactory extends Factory{
	
	int serial = 100;
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}
	
	@Override
	protected void registerProduct(Product product) {
		System.out.println(product + "を登録しました。");
	}

}
