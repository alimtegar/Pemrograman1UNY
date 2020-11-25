import java.awt.*;

public class Face {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(220, 150);
		Graphics g = panel.getGraphics();
		
		g.setColor(Color.BLACK);
		g.drawOval(10, 30, 100, 100);   // face outline
		
		g.setColor(Color.BLUE);
		g.fillOval(30, 60, 20, 20);     // eyes
		g.fillOval(70, 60, 20, 20);
		
		g.setColor(Color.RED);          // mouth
		g.drawLine(40, 100, 80, 100);
	}
}