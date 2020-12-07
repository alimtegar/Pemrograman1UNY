import java.util.*;
import java.io.*;

public class FrequentFlier {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("flyerinput.txt"));
      
      System.out.println(frequentFlier(input));
   }
   
   public static int frequentFlier(Scanner input) {
      int totalEarn = 0;
      
      while(input.hasNext()) {
         String flyer = input.next();
         int earn = input.nextInt();
         int x = 0;
         
         switch(flyer) {
            case "firstclass": x = 2; break;
            case "coach": x = 1; break;
         }

         totalEarn += earn*x;
      }
      
      return totalEarn;
   }
}