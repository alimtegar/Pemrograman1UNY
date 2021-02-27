import java.util.Arrays;

public class Banish {
    public static void main(String args[]) {
      int[] a1 = {2, 4, 6, 8, 2, 4, 8, 6, 2, 2, 8, 4, 6};
      int[] a2 = {4, 6, 2, 8};
      System.out.print(Arrays.toString(banish(a1, a2)));
    }
    
    public static int[] banish(int[] a1, int[] a2) {
        for(int i = 0; i < a1.length; i++) {
            for(int j = 0; j < a2.length; j++) {
                // Debug
                // System.out.print(Arrays.toString(a1) + "\t");
                // System.out.print("" + i + ":" + "" + a1[i]);
                // System.out.print("\t\t== " + j + ":" + a2[j]+"\t");

                // Untuk cek satu-satu nilai a1 apakah ada yang sama dengan nilai-nilai di a2
                if(a1[i] == a2[j]) {
                    // Geser mundur 1 langkah dengan mengganti nilai dengan nilai di depannya
                    for(int k = i; k < a1.length-1; k++) {
                        a1[k] = a1[k+1];
                    }
    
                    a1[a1.length-1] = 0;    // Isi angka 0 pada indeks terakhir
                    if(i > 0){ i--; }       // Untuk cek mundur karena a1 tergeser mundur 1 langkah 
                    j=-1;                   // Untuk cek dengan a2 dari awal
                };

                // Debug
                // System.out.println(Arrays.toString(a1));
            }
        }
    
        return a1;
    }
}