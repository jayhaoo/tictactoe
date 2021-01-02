package polygon;

import java.util.ArrayList;

abstract public class LineList {
	
	private ArrayList<DrawableLine> lines;
	private boolean withVertices;
	
	protected LineList() {
		this(true);
	}
	
	protected LineList(boolean withVertices) {
		this.withVertices = withVertices;
		lines = new ArrayList<DrawableLine>();
	}
	
	protected void addLine(Point start, Point end) {
		lines.add(new DrawableLine(start, end, withVertices));
	}
	
}