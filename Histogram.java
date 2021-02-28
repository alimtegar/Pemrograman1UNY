import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        
        System.out.print("File: ");
        String fileName = in.next();
        
        in.close();
        
        Scanner file = new Scanner(new File(fileName));
            
        int[] scoreStars = new int[11];

        while (file.hasNextInt()) {
            int score = file.nextInt();

            // Untuk cek jumlah setiap nilai dari rentang 0-9, 10-19, ...
            for (int i = 0; i <= 100; i += 10) {
                if (score >= i && score <= (i + 9)) {
                    scoreStars[i / 10]++;
                }
            }
        }

        // Cetak setiap jumlah menjadi bintang
        for (int i = 0; i < scoreStars.length; i++) {
            String str = i < 10 
                ? String.format("%02d", i * 10) + "-" + String.format("%02d", i * 10 + 9) + ": " 
                : String.format("  %02d", i * 10) + ": ";

            System.out.print(str);
            for (int j = 0; j < scoreStars[i]; j++) { System.out.print("*"); }
            System.out.println();
        }
    }
}
