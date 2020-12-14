import java.util.Arrays;

public class Equals {
   public static void main(String[] args) {
      int[] a1 = {10, 20, 30, 40, 50, 60};
      int[] a2 = {10, 20, 30, 40, 50, 60};
      int[] a3 = {20, 3, 50, 10, 68};
   
      System.out.println(equals(a1, a2));   
      System.out.println(equals(a1, a3));
   }
   
   public static boolean equals(int[] a1, int[] a2) {
      return Arrays.equals(a1, a2);
   }
}