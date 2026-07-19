package com.anshi.playorithm.common;

public enum GameType {
	NUMBER("NG");
	
	private final String prefix;
	
	GameType(String prefix) {
		this.prefix=prefix;
	}

	public String getPrefix() {
		return prefix;
	}
}