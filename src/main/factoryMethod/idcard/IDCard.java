package main.factoryMethod.idcard;

import main.factoryMethod.framework.Product;

public class IDCard extends Product{
	private String owner;
	
	IDCard(String owner) {
		System.out.println(owner + "のカードを作成します。");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(this + "のカードを使用します。");
	}
	
	@Override
	public String toString() {
		return "[IDCard:" + owner + "]";
	}
	
	public String getOwner() {
		return owner;
	}
}
