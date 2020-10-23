public class Square {
   public static void main(String[] args) {
      printSquare(3, 6);
   }
   
   public static void printSquare(int start, int end) {
      int range = end - start;
      
      for(int i = 0; i <= range; i++) {
         for(int j = 0; j <= range; j++) {
            int n = start + i + j;
            
            // Jika lebih besar dari end kembali ke start
            if (n > end) { n -= (range + 1); }
         
            System.out.print(n);
         }
         
         System.out.println();
      }
   }
}