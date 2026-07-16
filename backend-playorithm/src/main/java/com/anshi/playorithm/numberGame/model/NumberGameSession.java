package com.anshi.playorithm.numberGame.model;

import java.time.Instant;

import com.anshi.playorithm.numberGame.enums.Difficulty;
import com.anshi.playorithm.numberGame.enums.StateNumberGame;

public class NumberGameSession {
	private final String gameId;
	private final Difficulty difficulty;
	private final int targetNumber;
	private final Instant startTime;
	
	private int attemptCount;
	private StateNumberGame state;
	
	
	NumberGameSession(String gameId, Difficulty difficulty, int targetNumber, Instant startTime){
		
	}
}
