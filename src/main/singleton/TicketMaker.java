package main.singleton;

public class TicketMaker {
	private int ticket = 1000;
	
	private static TicketMaker ticketMaker = new TicketMaker();
	
	private TicketMaker() {
		System.out.println("Instance for ticket maker is generated");
	}
	
	
	public static TicketMaker getInstance() {
		return ticketMaker;
	}
	
	public int getNextTicketNumber() {
		return ticketMaker.ticket++;
	}
}
