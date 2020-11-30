public class Fencepost {
   public static void main(String[] args) {
      System.out.print(1);            // |==|==|==|==| fence
      for (int i = 2; i <= 5; i++) {
         System.out.print(".." + i);  // 1..2..3..4..5
      }
   }
}