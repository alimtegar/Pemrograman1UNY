public class AgeCheck2 {
    public static void main(String[] args) {
        int myAge = 19;   // I am 19; let me see if I can drive
        message(myAge);
    }

    // Possibly prints some message(s) to the user based on the given age
    public static void message(int age) {
        if (age >= 21) {
            System.out.println("I can legally purchase alcohol!");
        } else if (age >= 17) {
            System.out.println("I can purchase a ticket to an R-rated movie.");
        } else if (age >= 16) {
            System.out.println("I can get my driver's license!");
        }
    }
}