public class EvenDigits {
    public static void main(String args[]) {
        System.out.print(evenDigits(8342116));
    }
    
    public static int evenDigits(int n) {
        if (n == 0) {
            return 0;
        } 
        
        if (n % 2 != 0) {
            return evenDigits(n / 10);
        }
        
        return evenDigits(n / 10) * 10 + n % 10;
    }
}
