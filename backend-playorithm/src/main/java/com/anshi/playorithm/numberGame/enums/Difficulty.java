package com.anshi.playorithm.numberGame.enums;

public enum Difficulty{
	EASY(10,3,0,20),
	MEDIUM(5,2,0,50),
	HARD(3,1,0,100);
	
	private int maxAttempts;
	private int timeLimitInMinute;
	private int minNum;
	private int maxNum;
	
	Difficulty(int maxAttempts, int timeLimitInMinute, int minNum, int maxNum){
		this.maxAttempts=maxAttempts;
		this.timeLimitInMinute=timeLimitInMinute;
		this.minNum=minNum;
		this.maxNum=maxNum;
	}

	public int getMaxAttempts() {
		return maxAttempts;
	}

	public int getTimeLimitInMinute() {
		return timeLimitInMinute;
	}

	public int getMinNum() {
		return minNum;
	}

	public int getMaxNum() {
		return maxNum;
	}
}