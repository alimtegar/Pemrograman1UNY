import java.awt.*;

public class Hyena extends Critter {
   private int moves;
   private boolean hungry;
   private int i = 1;

   public boolean eat() {
      moves = 0;
      
		return true;
	}

   public Color getColor() {
      return Color.RED;
   }
   
   public Direction getMove() {
      moves++;
      
      if (moves == 2 + i) { return Direction.SOUTH; }
      
      // Increase moves for sideways direction 
      for (int j = 0; j < i; j++) {
         if (moves == 3 + j + i) { 
            if (j == i - 1) { moves = 0; i++; }

            return Direction.WEST; 
         }
         
         if (moves == 2 + j) { return Direction.EAST; }
      }
      
      return Direction.NORTH;
   }

   public String toString() {
      return "h";
   }
} 