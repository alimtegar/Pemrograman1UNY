public class TAsPaymentCalculator {
   public static void main(String[] args) {
      double salary = 4.00;
      int workHours = 11;
      
      System.out.print("TA's payment (salary = " + salary + ", work hours = " + workHours + "): " + pay(salary, workHours));
   }
   
   public static double pay(double salary, int workHours) {
      double payment;
      int maxWorkHours = 8, 
          overtimeWorkHours = workHours - maxWorkHours;
      
      if (overtimeWorkHours > 0) {
         payment = (salary * maxWorkHours) + ((salary * 1.5) * overtimeWorkHours);
      } else {
         payment = salary * workHours;
      }
      
      return payment;
   }
}