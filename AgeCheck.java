public class AgeCheck {
    public static void main(String[] args) {
        int myAge = 19;   // I am 19; let me see if I can drive
        message(myAge);
    }

    // Displays a message about driving to user based on given age
    public static void message(int age) {
        if (age >= 16) {
            System.out.println("I'm old enough to drive!");
        } else {
            System.out.println("Not old enough yet... :*(");
        }
    }
}