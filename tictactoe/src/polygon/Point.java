package polygon;

public class Point {
		
	private final int x;
	private final int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(Point otherPoint) {
		return Math.sqrt(Math.pow(otherPoint.x - x,  2) + Math.pow(otherPoint.y - y, 2));
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	
}