// Building Java Programs, Chapter 4 Lab
// Improve this program by factoring redundant code from the method below.

public class FactorExample {
    public static void main(String[] args) {
        // write some test calls here
        factoring(4);
    }

    public static void factoring(double gpa) {
        int credits = 5;
        
        if (gpa >= 3.5) {
            if (gpa == 4.0) {
                System.out.println("I'm valedictorian for this class! Woo hoo!");
            }
            
            System.out.println("I made the dean's list for this class!");
        } else if (gpa < 1.5) {
            if (gpa <= 0.7) { 
               credits = 0;
               
               System.out.println("Uh-oh..I probably should have studied a little more.");
            }
        
            System.out.println("Uh-oh..I probably should have studied a little more.");
        }
        
        System.out.println("I received " + credits + " credits for this class.");
    }
}