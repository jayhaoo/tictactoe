package board;

import polygon.LineList;
import polygon.Point;

public class BoardView extends LineList {
	
	private static final int CELL_SIDE = 130;
	private static final int MARGIN = 10;
	private static final int PADDING = 5;
	
	private int rows;
	private int columns;
	private WinLine winLine;
	
	public BoardView(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		//rows = 3;
		//columns = 3;
		winLine = null;
		
		/* Vertical Lines */
		for (int i = 1; i < columns; i++) {
			addLine(
					new Point(MARGIN + CELL_SIDE * i, MARGIN),
					new Point(MARGIN + CELL_SIDE * i, MARGIN + columns * CELL_SIDE));
		}
		
		/* Horizontal lines */
		for (int i = 1; i < rows; i++) {
			addLine(
					new Point(MARGIN, MARGIN + CELL_SIDE * i),
					new Point(MARGIN + rows * CELL_SIDE, MARGIN + CELL_SIDE * i));
		}
	}
	
	Marker displayMarker(Cell cell) {
		return MarkerFactory.getMarker(cell.getType(), CELL_SIDE - 2 * PADDING, 
				MARGIN + cell.getColumn() + PADDING,
				MARGIN + cell.getRow() * CELL_SIDE + PADDING);
	}
	
	void declareWinner(Sequence sequence) {
		int startRow = sequence.getStartRow();
		int startColumn = sequence.getStartColumn();
		int endRow = sequence.getEndRow();
		int endColumn = sequence.getEndColumn();
		
		double startXOffset = 0;
		double startYOffset = 0;
		double endXOffset = 0;
		double endYOffset = 0;
		
		if (startRow == endRow) {
			startYOffset = 0.5;
			endYOffset = 0.5;
			endYOffset = 1;
		} else if (startColumn == endColumn) {
			startXOffset = 0.5;
			endXOffset = 0.5;
			endYOffset = 0.5;
		} else {
			endXOffset = 1;
			endYOffset = 1;
		}
		
		Point startPoint = new Point(
				(int)(MARGIN + CELL_SIDE * (Math.min(startColumn, endColumn) + startXOffset)),
				(int)(MARGIN + CELL_SIDE * (Math.min(startRow, endRow) + startYOffset)));
		Point endPoint = new Point(
				(int)(MARGIN + CELL_SIDE * (Math.max(startColumn, endColumn) + endXOffset)),
				(int)(MARGIN + CELL_SIDE * (Math.max(startRow, endRow) + endYOffset)));
		winLine = new WinLine(startPoint, endPoint);
	}
	
	void resetWinner() {
		if (winLine != null) {
			winLine.delete();
			winLine = null;
		}
	}
}






