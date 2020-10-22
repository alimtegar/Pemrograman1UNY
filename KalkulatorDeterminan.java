import java.util.Scanner;

public class KalkulatorDeterminan {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Persamaan Kuadrat: y = ax^2 + bx + c");
      
      // Masukkan a
      System.out.print("a: ");
      int a = in.nextInt();
   
      // Masukkan b
      System.out.print("b: ");
      int b = in.nextInt();
      
      // Masukkan c
      System.out.print("c: ");
      int c = in.nextInt();
      
      // Cari determinan
      System.out.println();
      System.out.println("Determinan: " + determinant(a, b, c));

      in.close();
   }
   
   // Determinan
   public static int determinant(int a, int b, int c) {
      return b * b - 4 * a * c;
   }
}