package main.facade;

import main.facade.pagemaker.PageMaker;

public class Main {

	public static void main(String[] args) {
		
		PageMaker.makeWelcomePage("alice@example.com", "welcom.html");
	}

}
