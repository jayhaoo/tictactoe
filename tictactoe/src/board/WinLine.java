package board;

import polygon.Point;
import polygon.Polygon;

public class WinLine extends Polygon {
	
	WinLine(Point start, Point end) {
		addPoint(start.getX(), start.getY());
		addPoint(end.getX(), end.getY());
	}
	
	void delete() {
		removeAll();
	}
}