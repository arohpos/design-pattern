package main.factoryMethod.idcard;

import main.factoryMethod.framework.Product;

public class IDCard extends Product{
	private String owner;
	private int serial = 0;
	
	IDCard(String owner, int serial) {
		System.out.println("#" + serial + ":" + owner + "のカードを作成します。");
		this.owner = owner;
		this.serial = serial;
	}

	@Override
	public void use() {
		System.out.println(this + "のカードを使用します。");
	}
	
	@Override
	public String toString() {
		return "[IDCard#" + serial + ":" + owner + "]";
	}
	
	public String getOwner() {
		return owner;
	}

	public int getSerial() {
		return serial;
	}
}
