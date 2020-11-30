public class Pow {
   public static void main(String[] args) {
      System.out.print(pow(2, -2));
   }
   
   public static double pow(int a, int b) {
      double c = 1;
      int n = (b < 0) ? -b : b;
      
      for(int i = 0; i < n; i++) {
         c = (b < 0) ? c/a : c*a;
      }
      
      return c;
   }
}