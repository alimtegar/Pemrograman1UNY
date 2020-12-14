public class PercentEven {
   public static void main(String[] args) {
      int[] array = {6, 2, 9, 11, 3};
      
      System.out.println(percentEven(array));   
   }
   
   public static double percentEven(int[] array) {
      if (array.length == 0) {
         return 0.0;
      } else {
         double evenNum = 0;
        
         for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNum++;
            }
         }
        
         return evenNum * 100 / array.length;    
      }
   }
}