public class PrintLetters {
   public static void main(String[] args) {
      printLetters("Rabbit");
   }
   
   public static void printLetters(String word) {
      if (word.length() > 0) {
         System.out.print(word.charAt(0));
         
         for(int i = 1; i < word.length(); i++) {
            System.out.print("-" + word.charAt(i));
         }
      }
   }
}