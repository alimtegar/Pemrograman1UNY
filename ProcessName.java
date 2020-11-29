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
        int iSpace = name.indexOf(" "); // Mengambil posisi indeks dari spasi
        
        String firstName = name.substring(0, iSpace),               // Mengambil nama depan dengan indeks spasi sebagai pembatasnya 
               lastName = name.substring(iSpace, name.length());    // Mengambil nama belakang dengan indeks spasi sebagai pembatasnya 
        name = 
            lastName +              // Nama belakang
            ", " + 
            firstName.charAt(0) +   // Mengambil karakter pertama (karakter dengan indeks 0) dari nama depan
            ".";
        
        return name;
    }
}
