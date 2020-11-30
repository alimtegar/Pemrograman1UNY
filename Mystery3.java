public class Mystery3 {
   public static void main(String[] args) {
      mystery3(19);	
      mystery3(42);	
      mystery3(48);	
      mystery3(40);	
      mystery3(64);
   }   
   
   public static void mystery3(int x) {
      int y = 0;
      while (x % 2 == 0) {
          y++;
          x = x / 2;
      }
      System.out.println(x + " " + y);
   }
}