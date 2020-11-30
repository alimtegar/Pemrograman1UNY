public class PrintFacttors {
   public static void main(String[] args) {
      printFactors(24);
   }
   
   public static void printFactors(int n) {
      if (n > 0) {
         System.out.print(1);
         
         for(int i = 2; i <= n; i++) {
            if (n % i == 0) {
               System.out.print(" and " + i);
            }
         }
      }
   }
}