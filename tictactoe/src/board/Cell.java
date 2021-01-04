package board;

public class Cell {
	
	private BoardView view;
	private int row;
	private int column;
	private MarkerType type;
	private Marker marker;
	
	Cell(BoardView view, int row, int column) {
		this.view = view;
		this.row = row;
		this.column = column;
		type = null;
	}
	
	void setType(MarkerType type) {
		if (marker != null && this.type != type) {
			marker.delete();
			marker = null;
		}
		this.type = type;
		if (type != null) {
			marker = view.displayMarker(this);
		}
	}
	
	public boolean isFilled() {
		return type != null;
	}
	
	public MarkerType getType() {
		return type;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
}





