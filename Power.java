public class Power {
    public static void main(String args[]) {
        System.out.print(power(3, 4));
    }
    
    public static int power(int base, int expo) {
        return (expo >= 1) ? base * power(base, expo-1) : 1;
    }
}
