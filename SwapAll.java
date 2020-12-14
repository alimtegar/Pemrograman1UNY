import java.util.Arrays;

public class SwapAll {
   public static void main(String[] args) {
      int[] a1 = {11, 42, -5, 27, 0, 89};
      int[] a2 = {10, 20, 30, 40, 50, 60};

      swapAll(a1, a2);
   }
   
   public static void swapAll(int[] a1, int[] a2) {
      int[] a0 = a1;
      
      a1 = a2;
      a2 = a0;
      
      // Check the contents of a1 and a2
      System.out.print("a1: ");
      System.out.println(Arrays.toString(a1));
      System.out.print("a2: "); 
      System.out.println(Arrays.toString(a2));
   }
}