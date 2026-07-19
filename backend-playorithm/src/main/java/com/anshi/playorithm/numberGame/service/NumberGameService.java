package com.anshi.playorithm.numberGame.service;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.anshi.playorithm.numberGame.enums.Difficulty;
import com.anshi.playorithm.numberGame.model.NumberGameSession;


@Service
public class NumberGameService {
	private final Map<String, NumberGameSession> activeGames=new HashMap<>();
	
	public NumberGameSession startGame(Difficulty difficulty) {
		
		
	}
}
