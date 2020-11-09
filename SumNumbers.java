import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.print("low? ");
        
        int low = in.nextInt();
        
        System.out.print("high? ");
        
        int high = in.nextInt();
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}