import java.util.*;  // for Scanner

public class ProcessName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        
        // your code goes here
        String name = console.nextLine();
        name = processName(name);
        
        System.out.println("Your name is: " + name);
    }
    
    public static String processName(String name) {
        int iSpace = name.indexOf(" ");
        String firstName = name.substring(0, iSpace),
               lastName = name.substring(iSpace, name.length());
        name = lastName + ", " + firstName.charAt(0) + ".";
        
        return name;
    }
}