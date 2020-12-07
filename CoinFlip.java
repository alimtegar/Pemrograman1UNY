import java.util.*;
import java.io.*;

public class CoinFlip {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("coininput.txt"));
      
      coinFlip(input);
   }
   
   public static void coinFlip(Scanner input) {
      while(input.hasNextLine()) {
         Scanner line = new Scanner(input.nextLine());
         double nT = 0;
         double nH = 0;
         
         while(line.hasNext()) {
            String word = line.next(); 
                   word = word.toLowerCase();
            
            nT += word.equals("t") ? 1 : 0;
            nH += word.equals("h") ? 1 : 0; 
         }
         
         System.out.println((int) nH + " Heads (" + (nH/(nH+nT) * 100) + "%)");
         if(nH > nT) { System.out.println("You win"); }
         System.out.println();
      }
   }
}