import java.util.Arrays;

public class CopyRange {
   public static void main(String[] args) {
      int[] a1 = {10, 20, 30, 40, 50, 60};
      int[] a2 = {91, 92, 93, 94, 95, 96};
      
      copyRange(a1, a2, 0, 2, 3);
   }
   
   public static void copyRange(int[] a1, int[] a2, int i1, int i2, int l) {
      for(int i = i1; i < l; i++) {
         a2[i + i2] = a1[i];
      }
      
      // Check the contents of a2 
      System.out.println(Arrays.toString(a2));
   }
}