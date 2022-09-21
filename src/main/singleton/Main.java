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

		System.out.println("start!!");
		Triple a1 = Triple.getInstance("ALPHA");
		Triple a2 = Triple.getInstance("ALPHA");
		Triple b1 = Triple.getInstance("BETA");
		Triple b2 = Triple.getInstance("BETA");
		Triple c1 = Triple.getInstance("GAMMA");
		Triple c2 = Triple.getInstance("GAMMA");
		if(a1 == a2) {
			System.out.println("a1 == a2");
		}else {
			System.out.println("a1 != a2");			
		}
		if(b1 == b2) {
			System.out.println("b1 == b2");
		}else {
			System.out.println("b1 != b2");			
		}
		if(c1 == c2) {
			System.out.println("c1 == c2");
		}else {
			System.out.println("c1 != c2");			
		}
		
		System.out.println("end!!");
		
		
		
	}
}
