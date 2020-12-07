import java.util.*;
import java.io.*;

public class MostCommonNames {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("nameinput.txt"));
      
      mostCommonNames(input);
   }
   
   public static void mostCommonNames(Scanner input) {
      while(input.hasNextLine()) {
         Scanner line = new Scanner(input.nextLine());
         
         String name = line.next();
         int nName = 1;
         
         String commonName = name;
         int nCommonName = nName;
         
         while(line.hasNext()) {
            String tmpName = line.next();
            
            if(name.equals(tmpName)) {
               nName++;
            } else {
               nName = 1;
            }
            
            if(nName > nCommonName) {
               commonName = name;
               nCommonName = nName;
            }
            
            name = tmpName;
         }
         
         System.out.println("Most common: " + commonName);
      }
   }
}