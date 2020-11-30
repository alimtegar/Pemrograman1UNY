public class SeeMovie {
   public static void main(String[] args) {
      seeMovie(11, 5);
   }
   
   public static void  seeMovie(double cost, double rating) {
      String isInterested = "not";
      
      if (
         cost < 5 || 
         (cost < 12 && rating == 5)
      ) {
         isInterested = "very";
      } else if (
         (cost >= 12 && rating == 5) || 
         (cost < 12 && rating >= 2 && rating <= 4)
      ) {
         isInterested = "sort-of";
      }
   
      System.out.print(isInterested);
   }
}