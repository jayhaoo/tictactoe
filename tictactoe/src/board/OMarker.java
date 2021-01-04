package board;

import polygon.Polygon;

public class OMarker extends Polygon implements Marker {
	
	static private final int NUMBER_VERTICES = 24;
	
	OMarker(int size, int left, int top) {
		setWithVertices(false);
		double radius = size / 2.0;
		for (int i = 0; i < NUMBER_VERTICES; i++) {
			addPoint(
					(int)(left + size / 2.0 + radius * Math.cos(2 * Math.PI * i / NUMBER_VERTICES)),
					(int)(top + size / 2.0 + radius * Math.sin(2 * Math.PI * i / NUMBER_VERTICES)));
		}
	}
	
	public void delete() {
		removeAll();
	}
}