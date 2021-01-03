public class Skunk extends Critter {
   private int moves;
   private boolean hungry;
    
   public void Skunk() {  // constructor
      hungry = false;
   }
    
   public boolean eat() {
      hungry = true;
      
      return true;
   }
    
   public Direction getmoves() {
      moves++;
      
      moves = moves >= 3 ? 0 : moves;
      
      if (moves == 1 || moves == 2) {
         return Direction.WEST;
      } else if (hungry) {
         return Direction.NORTH;
      } else if (!hungry) {
         return Direction.SOUTH;
      }
      
      return null;
   }
}