import java.awt.*;

public class Butterfly extends Critter {
   private int moves;
   private boolean hungry;

   public Color getColor() {
      return Color.YELLOW;
   }
   
   public Direction getMove() {
      moves++;
      if (moves >= 3) {
         moves = 0;
      }
      
      if (moves == 1 || moves == 3) {
         return Direction.NORTH;
      } else if (moves == 2) {
         return Direction.NORTH;
      } else if (moves == 4) {
         return Direction.NORTH;
      } else {
         return Direction.EAST;
      }
   }

   public String toString() {
      return "x";
   }
} 