//継承によるadapter
/*
package main.adapter;

public class PrintBanner extends Banner implements Print{
	
	public PrintBanner(String string) {
		super(string);
	}
	
	@Override
	public void printWeak() {
		showWithParen();
	}
	
	@Override
	public void printStrong() {
		showWithAster();
	}
	
}
*/

//委譲によるadapter
package main.adapter;

public class PrintBanner extends Print{
	
	private Banner banner;
	
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}
	
	@Override
	public void printWeak() {
		banner.showWithParen();
	}
	
	@Override
	public void printStrong() {
		banner.showWithAster();
	}
	
}

