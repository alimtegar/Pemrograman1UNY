public class TimeSpanMain {
   public static void main(String[] args) {
      TimeSpan timeSpan = new TimeSpan(8, 0); 
      
      System.out.println("time span = " + timeSpan);
      
      timeSpan.add(2, 30);
      
      System.out.println("added time span = " + timeSpan);
   }
}