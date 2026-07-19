package com.anshi.playorithm.numberGame.model;

import java.time.Instant;

import com.anshi.playorithm.numberGame.enums.Difficulty;
import com.anshi.playorithm.numberGame.enums.StateNumberGame;

public class NumberGameSession {
	private final String gameId;
	private final Difficulty difficulty;
	private final int targetNumber;
	private final Instant startTime;
	
	private int attemptsUsed;
	private StateNumberGame state=StateNumberGame.RUNNING;
	
	public NumberGameSession(String gameId, Difficulty difficulty, int targetNumber, Instant startTime, int attemptsUsed, StateNumberGame state){
		this.gameId=gameId;
		this.difficulty=difficulty;
		this.targetNumber=targetNumber;
		this.startTime=startTime;
		this.attemptsUsed=0;
		this.state=StateNumberGame.RUNNING;
	}
	
	public void incrementAttempts() {
		attemptsUsed++;
	}
	
	public void markAsWon() {
		state=StateNumberGame.WON;
	}
	
	public void markAsLost() {
		state=StateNumberGame.LOST;
	}
	
	public void markAsTimeUp() {
		state=StateNumberGame.TIME_UP;
	}
	
	public boolean canAcceptGuess() {
		return state==StateNumberGame.RUNNING;
	}
}
