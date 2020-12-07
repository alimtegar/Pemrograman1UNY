import java.util.*;
import java.io.*;

public class FlipLines {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("lineinput.txt"));
      
      flipLines(input);
   }
   
   public static void flipLines(Scanner input) {
      while(input.hasNextLine()) {
         String line1 = input.nextLine();
         String line2 = input.nextLine();
         
         System.out.println(line2);
         System.out.println(line1);
      }
   }
}