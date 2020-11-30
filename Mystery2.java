public class Mystery2 {
   public static void main(String[] args) {
      mystery2(25, 2);	
      mystery2(32, 4);	
      mystery2(10345, 10);	
      mystery2(63, 2);
   }
   
   public static void mystery2(int x, int y) {
      int z = 0;
      while (x % y != 0) {
         x = x / y;
         z++;
         System.out.print(x + ", ");
      }

      System.out.println(z);
   }
}