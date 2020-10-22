import java.util.Scanner;

public class Kalkulator {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      // Masukkan nomor 1 
      System.out.print("Nomor 1: ");
      int n1 = in.nextInt();
      
      // Masukkan nomor 2 
      System.out.print("Nomor 2: ");
      int n2 = in.nextInt();
      
      // Masukkan operator 
      System.out.print("Operator: ");
      String op = in.next();
      
      // Cari hasil 
      System.out.println();
      int hasil = 0;
      
      switch(op) {
         case "+":
            hasil = tambah(n1, n2);
            break;
         case "-":
            hasil = kurang(n1, n2);
            break;
         case "*":
            hasil = kali(n1, n2);
            break;
         case "/":
            hasil = bagi(n1, n2);
            break;
         default:
            System.out.print("Tidak dapat mengeoperasikan nomor");
            in.close();
            return; // Menghentikan eksekusi kode selanjutnya
      }
      
      System.out.print(n1 + " " + op + " " + n2 + " = " + hasil);

      in.close();
   }
   
   public static int tambah(int n1, int n2) { return n1 + n2; } // Tambah 
   public static int kurang(int n1, int n2) { return n1 - n2; } // Kurang
   public static int kali(int n1, int n2) { return n1 * n2; } // Kali
   public static int bagi(int n1, int n2) { return n1 / n2; } // Bagi
}