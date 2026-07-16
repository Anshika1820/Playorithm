package com.anshi.playorithm.numberGame.model;

import java.time.Instant;

import com.anshi.playorithm.numberGame.enums.Difficulty;
import com.anshi.playorithm.numberGame.enums.StateNumberGame;

public class NumberGameSession {
	private final String gameId;
	private final Difficulty difficulty;
	private final int targetNumber;
	private final Instant startTime;
	
	private int attemptsUsed=0;
	private StateNumberGame state=StateNumberGame.RUNNING;
	
	public NumberGameSession(String gameId, Difficulty difficulty, int targetNumber, Instant startTime){
		this.gameId=gameId;
		this.difficulty=difficulty;
		this.targetNumber=targetNumber;
		this.startTime=startTime;
	}
}
