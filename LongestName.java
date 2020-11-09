import java.util.Scanner;

public class LongestName {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      
      longestName(console, 4);
   }
   
   public static void longestName(Scanner console, int n) {
      String longestName = "";
      
      for(int i = 0; i < n; i++) {
         System.out.print("name #" + (i + 1) + "? ");
         
         String name = console.next();
         
         if (name.length() > longestName.length()) {
            longestName = name;
         }
      }
      
      System.out.print(capitalize(longestName) + "'s name is longest");
   }
   
   public static String capitalize(String text) {
      return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
   }
}