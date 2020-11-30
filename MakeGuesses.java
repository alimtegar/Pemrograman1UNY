import java.util.Random;

public class MakeGuesses {
   public static void main(String[] args) {
      makeGuesses();
   }
   
   public static void makeGuesses() {
      Random random = new Random();
      int totalGuesses = 0;
      boolean stop = false;
     
      while(!stop) {
         int randomN = random.nextInt(50) + 1;
         
         System.out.println("guess = " + randomN);
         
         if (randomN >= 48) { stop = true; }
         
         totalGuesses++;
      }
      
      System.out.print("total guesses = " + totalGuesses);
   }
}