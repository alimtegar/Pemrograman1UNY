public class Repl {
   public static void main(String[] args) {
      System.out.print(repl("hello", 3));
   }
   
   public static String repl(String l, int n) {
      String repl = "";
      
      for (int i = 0; i < n; i++) {
         repl += l;
      }
      
      return repl;
   }
}