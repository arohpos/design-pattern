package main.templateMethod;

//public class StringDisplay extends AbstractDisplay{
public class StringDisplay implements AbstractDisplay{
	private String string;
	private int width;
	
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.length(); 
	}
	
	@Override
	public void open() {
		printLne();
	}
	
	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}
	
	@Override
	public void close() {
		printLne();
	}
	
	public void printLne() {
		System.out.print("+");
		for(int i = 0; i < width; i++) {
			System.out.print("-");			
		}
		System.out.println("+");
	}
}
