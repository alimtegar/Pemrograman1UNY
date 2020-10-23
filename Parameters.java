public class Parameters {
    public static void main(String[] args) {
        double bubble = 867.5309;
        double x = 10.01;
        double y = 5.3;
        printer(x, y);
        printer(x, 0.0);
        int z = 5;
        System.out.println("z = " + z);
    }

    public static void printer(double x, double y) {
        System.out.println("x = " + x + " and y = " + y);
        int z = 5;
    }
}