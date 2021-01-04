import java.awt.*;

public class Shark extends Critter {
   private int moves;
   private boolean hungry;
   private int i = 0;

   public Color getColor() {
      return Color.BLUE;
   }
   
   public Direction getMove() {
      if (moves == i) { moves = 0; i++; }
      
      moves++;
      
      // Odd turn 
      if (i % 2 == 0) { return Direction.SOUTH; } 
            
      // Even turn 
      return Direction.NORTH;
   }

   public String toString() {
      return "a";
   }
}