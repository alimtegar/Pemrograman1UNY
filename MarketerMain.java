public class MarketerMain {
   public static void main(String[] args) {
      Marketer marketer = new Marketer();
      
      System.out.println("Marketer's salary = " + marketer.getSalary());
      
      marketer.advertise();
   }
}