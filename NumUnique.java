public class NumUnique {
   public static void main(String[] args) {
      System.out.print(numUnique(18, 3, 4));
   }
   
   public static int numUnique(int num1, int num2, int num3) {
      int numUnique = 0;
      
      if (num1 != num2) { numUnique++; }
      if (num1 != num3) { numUnique++; }
      if (num2 != num3) { numUnique++; }
      
      return numUnique;
   }
}