import java.lang.Math;

public class Point {
	int x;
	int y;
	
	public double distanceFromOrigin() {
		double dist = Math.sqrt(x*x + y*y);
		return dist;
	}
	
	public double distance(Point other) {
		int dx = other.x - x;
		int dy = other.y - y;
		double dist = Math.sqrt(dx*dx + dy*dy);
		return dist;
	}
	
	public void translate(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	public String toString() {
		return "java.awt.Point[x=" + x + ",y=" + y + "]";
	}
   
   public int quadrant() {
      int quadrant = 0;
           
      if (x > 0 && y > 0) { quadrant = 1; }
      else if (x < 0 && y > 0) { quadrant = 2; }
      else if (x < 0 && y < 0) { quadrant = 3; }
      else if (x > 0 && y < 0) { quadrant = 4; }
       
      return quadrant;
   }
   
   public void flip() {
       int initX = x;
       
       x = -y;
       y = -initX;
   }
   
   public int manhattanDistance(Point other) {
      int dx = Math.abs(other.x - x);
		int dy = Math.abs(other.y - y);
      int dist = dx + dy;
      return dist;
   }
}