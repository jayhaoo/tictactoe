package human;

import java.util.Scanner;
import board.Board;
import board.MarkerType;
import board.Player;
import polygon.Point;
import polygon.PolygonMaker;

public class HumanPlayer extends Player {
	
	private Scanner scanner;
	
	public HumanPlayer(String name) {
		super(name);
		scanner = new Scanner(System.in);
	}
	
	public Point getPlay(MarkerType type, Board board) {
		System.out.println(getName() + ", select play(row, column): ");
		return PolygonMaker.getPoint(scanner);
	}
}