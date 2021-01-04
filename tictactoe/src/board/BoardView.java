package board;

import polygon.Point;

public class BoardView {
	
	private static final int CELL_SIDE = 130;
	private static final int MARGIN = 10;
	private static final int PADDING = 5;
	
	private int rows;
	private int columns;
	
	public BoardView(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		
	}
	
	Marker displayMarker(Cell cell) {
		return MarkerFactory.getMarker(cell.getType(), CELL_SIDE - 2 * PADDING, 
				MARGIN + cell.getColumn() + PADDING,
				MARGIN + cell.getRow() * CELL_SIDE + PADDING);
	}
}