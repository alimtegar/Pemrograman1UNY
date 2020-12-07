import java.util.*;
import java.io.*;

public class PrintDuplicates {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("duplicateinput.txt"));
      
      printDuplicates(input);
   }
   
   public static void printDuplicates(Scanner input) {
      while(input.hasNextLine()) {
         Scanner line = new Scanner(input.nextLine());
         String word = line.next();
         int nWord = 1;
        
         while (line.hasNext()) {
             String tmpWord = line.next();
             
             if (word.equals(tmpWord)) {
                 nWord++;
             } else {
                 if (nWord > 1) {
                     System.out.print(word + "*" + nWord + " ");
                 }
                 nWord = 1;
             }
             
             word = tmpWord;
         }
          
         if (nWord > 1) {
            System.out.print(word + "*" + nWord + " ");
         }
         
         System.out.println();
      }
   }
}