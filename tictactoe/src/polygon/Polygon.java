package polygon;

import java.util.ArrayList;

public class Polygon extends LineList {
	
	ArrayList<Point> points;
	
	public Polygon() {
		points = new ArrayList<Point>();
	}
	
	public void addPoint(int x, int y) {
		Point newEndPoint = new Point(x, y);
		points.add(newEndPoint);
		
		if (points.size() == 1) {
			return;
		}
		
		Point startPoint = points.get(0);
		if (points.size() == 2) {
			addLine(startPoint, newEndPoint);
		}
		
		Point oldEndPoint = points.get(points.size() - 2);
		if (startPoint != oldEndPoint) {
			addLine(startPoint, newEndPoint);
			return;
		}
		
		addLine(oldEndPoint, newEndPoint);
		addLine(newEndPoint, startPoint);
	}
	
	int getNumberVertices() {
		return points.size();
	}
	
}








