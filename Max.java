public class Max {
   public static void main(String[] args) {
      int[] nums = {3, 1, 4};
       
      System.out.println(max(nums));
   }
   
   // Returns the largest value in the given array.
   public static int max(int[] data) {
       int max = data[0];
       for (int i = 1; i < data.length; i++) {
           if (data[i] > max) {
               max = data[i];
           }
       }
       return max;
   }
}