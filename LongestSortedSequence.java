public class LongestSortedSequence {
   public static void main(String[] args) {
      int[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5};
      
      System.out.println(longestSortedSequence(a));
   }
   
   public static int longestSortedSequence(int[] a) {
      if(a.length == 0)
         return 0;

      int maxLen = 1;
      int len = 1;
    
      for(int i = 1; i < a.length; i++) {
         if(a[i-1] <= a[i]) {
            len++;
         } else {
            if(len > maxLen) {
                maxLen = len;
            }
            
            len = 1;
         }
      }
    
      return Math.max(maxLen, len);
   }
}