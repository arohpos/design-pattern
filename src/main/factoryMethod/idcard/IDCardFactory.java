package main.factoryMethod.idcard;

import main.factoryMethod.framework.Factory;
import main.factoryMethod.framework.Product;

public class IDCardFactory extends Factory{
	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}
	
	@Override
	protected void registerProduct(Product product) {
		System.out.println(product + "を登録しました。");
	}

}
