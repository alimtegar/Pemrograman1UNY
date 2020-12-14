import java.util.Scanner;

public class PromptNumbers2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers will you enter? ");
		int count = console.nextInt();
      int[] nums = new int[count];
		
		for (int i = 0; i < count; i++) {
			// your code goes here; store the numbers
			System.out.print("Type a number: ");
			nums[i] = console.nextInt();
		}
		
		System.out.println("Your numbers in forward order:");
      printForward(nums);

      System.out.println("Your numbers in backward order:");
      printBackward(nums);
	}
   
   // Prints the elements of the given array in forward order.
   public static void printForward(int[] a) {
      for (int i = 0; i < a.length; i++) {
         System.out.println(a[i]);
      }
   }
   
   // Prints the elements of the given array in backward order.
   public static void printBackward(int[] a) {
      for (int i = a.length - 1; i >= 0; i--) {
         System.out.println(a[i]);
      }
   }
}