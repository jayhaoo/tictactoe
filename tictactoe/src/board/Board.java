package board;

//import java.util.ArrayList;

public class Board {
	
	/* Basic parameters for tic tac toe */
	private static final int DEFAULT_ROWS = 3;
	private static final int DEFAULT_COLUMNS = 3;
	private static final int DEFAULT_IN_ROW_TO_WIN = 3;
	
	private int rows;
	private int columns;
	private int inRowToWin;
	//private Cell[][] cells;
	private BoardView view;
	//private ArrayList<Sequence> sequences;
	//private Sequence winningSequence;
	
	public Board() {
		rows = DEFAULT_ROWS;
		columns = DEFAULT_COLUMNS;
		inRowToWin = DEFAULT_IN_ROW_TO_WIN;
		view = new BoardView(rows, columns);
		
		
	}
	
	
}