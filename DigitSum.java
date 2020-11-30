public class DigitSum {
   public static void main(String[] args) {
      System.out.println(digitSum(29107));
      System.out.println(digitSum(-456));
      System.out.println(digitSum(0));
   }
   
   public static int digitSum(int n) {
      n = (n < 0) ? -n : n;   // Make a negative number positive
   
      int digitSum = 0;
      
      while(n != 0) {
         digitSum += n % 10;  // Sum the last digit of number
         n /= 10;             // Remove the last digit of number
      }
      
      return digitSum;
   }
}