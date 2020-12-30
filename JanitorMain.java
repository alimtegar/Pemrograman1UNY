public class JanitorMain {
   public static void main(String[] args) {
      Janitor janitor = new Janitor();
      
      System.out.println("Janitor's hours = " + janitor.getHours());
      System.out.println("Janitor's salary = " + janitor.getSalary());
      System.out.println("Janitor's vacation days = " + janitor.getVacationDays());
      
      janitor.clean();
   }
}