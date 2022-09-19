package main.templateMethod;

public class Main {

	public static void main(String[] args) {
		
		CharDisplay d1 = new CharDisplay('H');
		d1.display();
		
		StringDisplay d2 = new StringDisplay("Hello, World");
		d2.display();
	}

}
