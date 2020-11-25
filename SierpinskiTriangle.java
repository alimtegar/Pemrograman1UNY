import java.awt.*;

public class SierpinskiTriangle {
    public static final int P_WIDTH = 512;
    public static final int P_HEIGHT = (int) Math.round(P_WIDTH * Math.sqrt(3.0) / 2.0);
    public static final int LEVEL = 7;
    
    public static void main(String[] args) {
        DrawingPanel p = new DrawingPanel(P_WIDTH, P_HEIGHT);
        p.setBackground(Color.CYAN);
        Graphics g = p.getGraphics();
        
        Point p1 = new Point(0, P_HEIGHT);  // Left-bottom point
        Point p2 = new Point(P_WIDTH / 2, 0);  // Center-top point
        Point p3 = new Point(P_WIDTH, P_HEIGHT);  // Right-bottom point
        
        drawTriangle(LEVEL, g, p1, p2, p3);
    }

    // Draw triangle 
    public static void drawTriangle(int level, Graphics g, Point p1, Point p2, Point p3) {
        if (level == 1) {
            Polygon p = new Polygon();
            p.addPoint(p1.x, p1.y);
            p.addPoint(p2.x, p2.y);
            p.addPoint(p3.x, p3.y);
            g.fillPolygon(p);
        } else {
            Point p4 = getMidpoint(p1, p2);
            Point p5 = getMidpoint(p2, p3);
            Point p6 = getMidpoint(p1, p3);
            
            // Recurse 3 triangles
            drawTriangle(level - 1, g, p1, p4, p6);
            drawTriangle(level - 1, g, p4, p2, p5);
            drawTriangle(level - 1, g, p6, p5, p3);
        }
    }

    // Get midpoint 
    public static Point getMidpoint(Point p1, Point p2) {
        return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
    }
}