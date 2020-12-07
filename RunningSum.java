import java.util.*;
import java.io.*;

public class RunningSum {
   public static void main(String args[]) throws FileNotFoundException {
      Scanner input = new Scanner(new File("doubleinput.txt"));
      runningSum(input);
   }
   
   public static void runningSum(Scanner input) {
      double sum = 0;
      double maxSum = 0;
      
      System.out.print("runngin sum =");
      
      while (input.hasNextDouble()) {
         sum += input.nextDouble();
         maxSum = (sum > maxSum) ? sum : maxSum;
         
         System.out.print(" " + sum);
      }
      
      System.out.println();
      System.out.print("max sum = " + maxSum);
   }
}