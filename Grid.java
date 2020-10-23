public class Grid {
   public static void main(String[] args) {
      printGrid(4, 6);
   }
   
   public static void printGrid(int y, int x) {
      for(int i = 1; i <= y; i++) {
         for (int j = 0; j < x; j++) {
            System.out.print((i + (j * y)) + "\t");
         }
         
         System.out.println();
      }
   }
}