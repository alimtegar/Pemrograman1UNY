public class Quadrant {
   public static void main(String[] args) {
      System.out.print(quadrant(-2.3, 14.2));
   }
   
   public static int quadrant(double x, double y) {
      int quadrant = 0;
      
      if (x > 0 && y > 0) { quadrant = 1; }
      else if (x < 0 && y > 0) { quadrant = 2; }
      else if (x < 0 && y < 0) { quadrant = 3; }
      else if (x > 0 && y < 0) { quadrant = 4; }
      
      return quadrant;
   }
}