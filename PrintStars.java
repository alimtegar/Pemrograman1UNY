public class PrintStars {
    public static void main(String args[]) {
        printStars(5);
    }
    
    public static void printStars(int n) {
        if (n > 0) {
            System.out.print("*");
            printStars(n-1);
        }
    }
}
