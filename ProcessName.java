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
        
        String firstName = name.substring(0, iSpace),               // Mengambil nama depan (karakter dari index awal (0) sampai indeks spasi)
               lastName = name.substring(iSpace, name.length());    // Mengambil nama belakang ( karakter dari index spasi sampai index terakhir (yg didapat dari name.length())
        name = 
            lastName +              // Nama belakang
            ", " + 
            firstName.charAt(0) +   // Mengambil karakter pertama (karakter dengan indeks 0) dari nama depan
            ".";
        
        return name;
    }
}
