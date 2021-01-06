package board;

import polygon.Point;
import java.util.ArrayList;

abstract public class Player {
	
	private static ArrayList<Player> players = new ArrayList<>();
	
	private String name;
	
	public static ArrayList<Player> getPlayers() {
		return players;
	}
	
	protected Player(String name) {
		this.name = name;
		players.add(this);
	}
	
	abstract public Point getPlay(MarkerType type, Board board);
	
	public String getName() {
		return name;
	}
}