public class Square2 {
   public static void main(String[] args) {
      printSquare(3, 6);
   }
   
   public static void printSquare(int start, int end) {
      int range = end - start;
      
      for(int i = 0; i <= range; i++) {
         for(int j = 0; j <= range; j++) {
            // Jika lebih besar dari end kembali ke start
            System.out.print((j+i)%(range+1) + start);
         }
         
         System.out.println();
      }
   }
}