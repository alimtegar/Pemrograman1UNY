import java.util.*;
import java.io.*;

public class StripHtmlTags {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("htmlinput.txt"));
      
      stripHtmlTags(input);
   }
   
   public static void stripHtmlTags(Scanner input) {
      while (input.hasNextLine()) {
         String line = input.nextLine();
        
         while (line.contains("<") || line.contains(">")) {
            int iStTag = line.indexOf("<");  // Index of start tag
            int iEdTag = line.indexOf(">");  // Index of end tag
            
            if (iStTag == 0) {
                line = line.substring(iEdTag + 1);
            } else {
               line = line.substring(0, iStTag) + line.substring(iEdTag + 1);
            }
         }
        
         System.out.println(line);
      }
   }
}