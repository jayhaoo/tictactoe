package board;

import polygon.LineList;
import polygon.Point;

public class XMarker extends LineList implements Marker {
	
	XMarker(int size, int left, int top) {
		super(false);
		addLine(new Point(left, top), new Point(left + size, top + size));
		addLine(new Point(left, top + size), new Point(left + size, top));
	}
	
	public void delete() {
		removeAll();
	}
}