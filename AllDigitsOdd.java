public class AllDigitsOdd {
   public static void main(String[] args) {
      System.out.println(allDigitsOdd(135319));
      System.out.println(allDigitsOdd(9145293));
   }
   
   public static boolean allDigitsOdd(int n) {
      boolean allDigitsOdd = true;
      
      while(n != 0) {
         allDigitsOdd &= ((n%10) % 2 != 0);  // AND with condition for odd digit of the last digit of number
         n /= 10;                            // Remove the last digit of number
      }
      
      return allDigitsOdd;
   }
}