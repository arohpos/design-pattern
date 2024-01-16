package main.strategy;

public enum Hand {
	ROCK("グー", 0),
	SCISSORS("チョキ",1),
	PAPER("パー",2);
	
	private String name;
	private int handvalue;

	private Hand(String name, int handvalue) {
		this.name = name;
		this.handvalue = handvalue;
	}
	
	//手の値からenum定数を得るための配列
	private static Hand[] hands = {
			ROCK, SCISSORS, PAPER
	};
	
	//手の値からenum定数を得る
	public static Hand getHand(int handvalue) {
		return hands[handvalue];
	}
	
	//thisがhより強いときtrue
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}
	
	//thisがhより弱いときtrue
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}
	
	private int fight(Hand h) {
		if(this == h) {
			return 0;
		}else if((this.handvalue + 1) % 3 == h.handvalue) {
			return 1;
		}else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
	

}
