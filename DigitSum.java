public class DigitSum {
    public static void main(String args[]) {
        System.out.print(digitSum(1729));
    }
    
    public static int digitSum(int n) {
        return (n == 0) ? 0 : (n % 10 + digitSum(n / 10)); 
    }
}
