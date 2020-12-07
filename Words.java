import java.io.*;    // for File
import java.util.*;  // for Scanner

public class Words {
   public static void main(String args[]) throws FileNotFoundException {
      int wordCount = 0;
      Scanner input = new Scanner(new File("wordinput.txt"));
      
      System.out.println(input);
      
      // your code goes here ...
      while (input.hasNext()) {
            wordCount ++;
            
            input.next();
      }
      
      System.out.println("Total words = " + wordCount);
   }
}