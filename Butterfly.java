import java.awt.*;

public class Butterfly extends Critter {
   private int moves;
   private boolean hungry;
   private String string = "x";

   public Color getColor() {
      return Color.YELLOW;
   }
   
   public Direction getMove() {
      moves++;
      
      string = string == "x" ? "-" : "x";  // Alternate string for each move
      moves = moves >= 3 ? 0 : moves;
      
      if (moves == 2) { return Direction.WEST; } 
      else if (moves == 4) { return Direction.EAST; }
      
      return Direction.NORTH;
   }

   public String toString() {
      return string;
   }
} 