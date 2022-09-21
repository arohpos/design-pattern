package main.singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println("start!!");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1 and obj2 is same!");
		}else {
			System.out.println("obj1 and obj2 is not same!");			
		}		
		System.out.println("end!!");
		
		
		System.out.println("start!!");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1 + ":" +TicketMaker.getInstance().getNextTicketNumber());
		}
		
		System.out.println("end!!");
		
	}
}
