public class Basics {
   public static void main(String[] args) {
      int x = 1;
      System.out.print(x);
      
      while (x < 100) {
          x = x + x;
          System.out.print(", " + x);
      }
   }
}