package polygon;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Arrays;
import java.util.Random;


public class DrawableLine {
	
	static private final String FRAME_TITLE = "LINE DRAWER";
	static private final Dimension START_FRAME_DIMS = new Dimension(420, 420);
	static private final int VERTEX_SIZE = 10;
	static private final int LINE_WIDTH = 3;
	static private final int BOUNDS_BUFFER = 5;
	
	static private Random rand = new Random(10);
	static private JFrame frame = null;
	
}