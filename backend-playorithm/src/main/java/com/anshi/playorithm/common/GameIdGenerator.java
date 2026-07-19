package com.anshi.playorithm.common;

import org.springframework.stereotype.Service;

@Service
public class GameIdGenerator {
	private long latestId=0;
	private GameType gameType;
	
	public String generateGameId(GameType gameType) {
		latestId++;
		return String.format(gameType.getPrefix()+"-%d06", latestId);
	}
	
}