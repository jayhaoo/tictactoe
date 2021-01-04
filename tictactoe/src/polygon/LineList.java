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
	
	protected boolean removeLine(Point start, Point end) {
		for (DrawableLine line : lines) {
			if (line.getStart().equals(start) && line.getEnd().equals(end)) {
				line.remove();
				lines.remove(line);
				return true;
			}
		}
		return false;
	}
	
	protected void setWithVertices(boolean withVertices) {
		this.withVertices = withVertices;
	}
	
	protected void removeAll() {
		for (DrawableLine line : lines) {
			line.remove();
		}
		lines.clear();
	}
	
}





