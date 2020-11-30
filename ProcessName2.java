import java.util.Scanner;

public class ProcessName2 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Type your name: ");
      String name = in.nextLine();
      
      while(
         name.length() < 5 ||     // Check 5 chars
         name.indexOf(" ") == -1  // Check space
      ) {
         System.out.println("Error, must be at least 5 chars with a space.");
         
         System.out.print("Type your name: ");
         name = in.nextLine();
      }
      
      System.out.print("Your name is: " + processName(name));
   }
   
   public static String processName(String name) {
        int iSpace = name.indexOf(" ");
        String firstName = name.substring(0, iSpace),               
               lastName = name.substring(iSpace, name.length());
                   
        name = lastName + ", " + firstName.charAt(0) +  ".";
        
        return name;
    }
}