public class Mystery4 {
   public static void main(String[] args) {
      mystery4(2);	
      mystery4(5);	
      mystery4(24);	
      mystery4(28);
   }      
   
   public static void mystery4(int n) {
      int x = 1;
      int y = 2;
      while (y < n) {
          if (n % y == 0) {
              n = n / y;
              x++;
          } else {
              y++;
          }
      }
      System.out.println(x + " " + n);
   }
}