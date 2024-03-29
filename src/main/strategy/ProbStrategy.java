package main.strategy;

import java.util.Random;

//じゃんけんに勝ったら、前回と同じ手を出す戦略
public class ProbStrategy implements Strategy {

	private Random random;
	private int PrevHandValue = 0;
	private int currentHandValue = 0;
	private int[][] history = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

	public ProbStrategy(int seed) {
		random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		int bet = random.nextInt(getSum(currentHandValue));
		int handvalue = 0;
		if (bet < history[currentHandValue][0]) {
			handvalue = 0;
		} else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
			handvalue = 1;
		} else {
			handvalue = -2;
		}
		PrevHandValue = currentHandValue;
		currentHandValue = handvalue;
		return Hand.getHand(handvalue);
	}

	@Override
	public void study(boolean win) {
		if(win){
			history[PrevHandValue][currentHandValue]++;
		}else {
			history[PrevHandValue][(currentHandValue + 1) % 3]++;
			history[PrevHandValue][(currentHandValue + 2) % 3]++;
		}
	}

	private int getSum(int handvalue) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += history[handvalue][i];
		}
		return sum;
	}

}
