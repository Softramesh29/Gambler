package com.bridgelabz.Gambler;

public class GainOrLossUC2 {
	
		static final int EVERY_DAY_STAKE = 100;
		static final int BET_PER_DAY = 1;
		
	public static void main(String[] args) {	
		if(Math.random()>0.4) {
			int gain = EVERY_DAY_STAKE+BET_PER_DAY;
			System.out.println("The player Win the game and the Stake is "+ gain+ " Dollar");	
		}
		else {
			int loss = EVERY_DAY_STAKE+BET_PER_DAY;
			System.out.println("The player loss the game and the Stake is "+ loss+" Dollar");
		}
		
	}
}
