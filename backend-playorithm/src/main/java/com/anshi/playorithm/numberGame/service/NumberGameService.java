package com.anshi.playorithm.numberGame.service;

import java.util.Map;
import java.util.Random;
import java.time.LocalDateTime;
import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.anshi.playorithm.common.GameIdGenerator;
import com.anshi.playorithm.common.GameType;
import com.anshi.playorithm.numberGame.enums.Difficulty;
import com.anshi.playorithm.numberGame.model.NumberGameSession;

@Service
public class NumberGameService {
	private final GameIdGenerator gameIdGenerator;
	private final Map<String, NumberGameSession> activeGames=new HashMap<>();
	private final Random random=new Random();
	
	
	public NumberGameService(GameIdGenerator gameIdGenerator) {
		this.gameIdGenerator=gameIdGenerator;
	}
	
	public NumberGameSession startGame(Difficulty difficulty) {
		String gameId=gameIdGenerator.generateGameId(GameType.NUMBER);
		
		int max=difficulty.getMaxNum();
		int min=difficulty.getMinNum();
		int targetNumber=random.nextInt(max - min + 1) + min;
		
		LocalDateTime startTime=LocalDateTime.now();
	}
	
	NumberGameSession session=NumberGameSession(String gameId, int targetNumber, LocalDateTime startTime);
}