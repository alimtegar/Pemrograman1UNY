import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Throwable {
        int[] vals = { -1, 2, -4, 6, -9 };
        int[] nums = { 5, -1, 12, 10, 2, 8 };
        String str = "go seattle mariners";
        String filename = "file.txt";

        System.out.println("sum abs vals");
        System.out.println(sumAbsVals(vals));
        System.out.println();

        System.out.println("largest even");
        System.out.println(largestEven(nums));
        System.out.println();

        System.out.println("pig latin");
        System.out.println(pigLatin(str));
        System.out.println();

        System.out.println("for letter words");
        System.out.println(fourLetterWords(filename));
        System.out.println();
    }

    public static int sumAbsVals(int[] vals) {
        return Arrays.stream(vals).map(Math::abs).sum();
    }

    public static int largestEven(int[] nums) {
        return Arrays.stream(nums).filter(n -> n % 2 == 0).max().getAsInt();
    }

    public static String pigLatin(String str) {
        return Arrays.stream(str.split(" ")).map(s -> s.substring(1) + "-" + s.charAt(0) + "ay").reduce("",
                (s1, s2) -> s1 + " " + s2);
    }

    public static int fourLetterWords(String filename) throws IOException {
        return (int) Files.lines(Paths.get(filename)).mapToInt(String::length).filter(len -> len == 4).count();
    }
}
