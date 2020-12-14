public class Append {
   public static void main(String[] args) {
      int[] list1 = {3, 1, 4};
      int[] list2 = {1, 5, 9};
      int[] appendedList = append(list1, list2);
      
      for(int i = 0; i < appendedList.length; i++) {
         System.out.println(appendedList[i]);
      }
   }
   
   public static int[] append(int[] list1, int[] list2) {
      int[] a = new int[list1.length + list2.length];
      int i = 0;
    
      for(int j = 0; j < list1.length; j++) {
         a[i] = list1[j];
         i++;
      }
    
      for(int j = 0; j < list2.length; j++) {
         a[i] = list2[j];
         i++;
      }
    
      return a;
   }
}