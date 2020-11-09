import java.util.Scanner;

public class CollegeAdmit {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.println("University admission program");   
      System.out.print("What is your GPA? ");
      
      double gpa = in.nextDouble();
      
      System.out.print("What is your SAT? ");
      
      double sat = in.nextDouble();
      
      if (gpa >= 1.8 && sat >= 900) {
         System.out.println("You were accepted!");
      } else {
         System.out.println("You were rejected!");
      }
   }
}