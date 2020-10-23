import java.lang.Math;

public class AreaOfACircleCalculator {
   public static void main(String[] args) {
      double r = 2.0;
      
      System.out.print("Area of a Circle (r = " + r + "): " + area(r));
   }
   
   public static double area(double r) {
      return Math.PI * Math.pow(r, 2);
   }
}