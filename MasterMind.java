// import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class MasterMind {
   // GLOBAL VARIABLES
   public static String namaFile = "alim.txt";
   public static String[] daftarTingkatKesulitan = { "Sangat Mudah", "Mudah", "Sedang", "Sulit", };
   public static Scanner in = new Scanner(System.in);
   public static File file = new File(namaFile);
   public static PrintWriter outFile;

   // MAIN METHODS
   public static void main(String[] args) {
      mulaiPenulisan();
      mulaiPermainan();
      tutupPenulisan();
   }

   // METHODS
   // Ambil jumlah digit
   public static int ambilDigit(int tingkatKesulitan) {
      return (int) Math.pow(2, tingkatKesulitan - 1);
   }

   // Ambil jumlah maksimum tebakan
   public static int ambilMaksTebakan(int tingkatKesulitan) {
      return (int) Math.ceil(2.5 * ambilDigit(tingkatKesulitan));
   }

   // Atur tingkat kesulitan
   public static int aturTingkatKesulitan() {
      // Cetak daftar tingkat kesulitan
      for (int i = 1; i <= daftarTingkatKesulitan.length; i++) {
         String tingkatKesulitan = daftarTingkatKesulitan[i - 1], spasi = "";
         int panjang = 13;

         for (int j = 0; j < (panjang - tingkatKesulitan.length()); j++) {
            spasi += " ";
         }

         tulis(i + "." + tingkatKesulitan + spasi + "(" + tambah0(ambilDigit(i)) + " Digit dan "
               + tambah0(ambilMaksTebakan(i)) + " Tebakan)");
      }

      // Masukkan input dan validasi tingkat kesulitan
      int tingkatKesulitan = 0;
      boolean tervalidasi = false;

      while (!tervalidasi) {
         tulisMendatar("Pilih nomor: ");

         // Cek apakah input bertipe integer atau tidak
         while (!in.hasNextInt()) {
            outFile.println(in.next());
            cetakPeringatanMasukkan();
            tulisMendatar("Pilih nomor: ");
         }

         tingkatKesulitan = in.nextInt();

         outFile.println(tingkatKesulitan);

         // Cek apakah input sesuai degan pilihan yang tersedia
         tervalidasi = (tingkatKesulitan > 0 && tingkatKesulitan <= daftarTingkatKesulitan.length);

         if (!tervalidasi) {
            cetakPeringatanMasukkan();
         }
      }

      return tingkatKesulitan;
   }

   // Mulai permainan
   public static void mulaiPermainan() {
      tulisJudul("SELAMAT DATANG DI MASTERMIND");

      // Atur tingkat kesulitan
      tulis("Sebelum memulai permainan, pilih tingkat kesulitan: ");
      int tingkatKesulitan = aturTingkatKesulitan(), digit = ambilDigit(tingkatKesulitan),
            maksTebakan = ambilMaksTebakan(tingkatKesulitan);

      tulis("");
      tulis("Permainan dimulai dengan tingkat kesulitan: " + daftarTingkatKesulitan[tingkatKesulitan - 1]);
      tulis("");

      // Buat nomor rahasia
      int[] noRahasia = new int[digit];
      noRahasia = buatNoAcakBerdigit(digit);

      // Cetak nomor rahasia (sembunyikan jika program tidak di-debug)
      // System.out.println("Nomor rahasia: " + Arrays.toString(noRahasia));
      // System.out.println();

      // Mulai menebak
      int i = 0;
      boolean hasilTebakan;

      do {
         tulisJudul("TEBAKAN " + tambah0((i + 1)));
         tulis("Masukkan nomor tebakan (" + tambah0(digit) + " digit): ");

         // Input nomor tebakan
         int[] noTebakan = new int[digit];

         for (int j = 0; j < digit; j++) {
            // Masukkan input dan validasi tingkat kesulitan
            boolean tervalidasi = false;

            while (!tervalidasi) {
               tulisMendatar("Digit " + (j + 1) + ": ");

               // Cek apakah input bertipe integer atau tidak
               while (!in.hasNextInt()) {
                  outFile.println(in.next());
                  cetakPeringatanMasukkan();
                  tulisMendatar("Digit " + (j + 1) + ": ");
               }

               noTebakan[j] = in.nextInt();

               outFile.println(noTebakan[j]);

               // Cek apakah input sesuai degan pilihan yang tersedia
               tervalidasi = (tingkatKesulitan > 0 && noTebakan[j] < 10);

               if (!tervalidasi) {
                  cetakPeringatanMasukkan();
               }
            }
         }

         tulis("");

         // Cetak nomor tebakan (sembunyikan jika program tidak di-debug)
         // System.out.println("Nomor tebakan: " + Arrays.toString(noTebakan));
         // System.out.println();

         i++;

         // Tebak nomor rahasia
         hasilTebakan = tebakNoRahasia(noTebakan, noRahasia);

         // Cetak hasil tebakan
         if (hasilTebakan) {
            tulisJudul("BERHASIL");
            tulis("Selamat, anda berhasil menebak nomor rahasia");
            tulisNoRahasia(noRahasia);
         } else if (i == maksTebakan) {
            tulisJudul("GAGAL");
            tulis("Maaf, anda gagal menebak nomor rahasia");
            tulisNoRahasia(noRahasia);
         }
      } while (i < maksTebakan && !hasilTebakan);

      tulis("");
      tulis("");
   }

   // Mulai penulisan
   public static void mulaiPenulisan() {
      try {
         // Cek apakah file ada atau tidak
         if (file.exists()) {
            // Append file jika file sudah ada
            FileOutputStream fileStream = new FileOutputStream(file, true);

            outFile = new PrintWriter(fileStream);
         } else {
            // Create file jika file sudah ada
            outFile = new PrintWriter(namaFile);
         }

         // Rekam waktu penulisan
         outFile.println("Written on " + new Date()); 
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   // Tutup penulisan
   public static void tutupPenulisan() {
      outFile.close();
      in.close();
   }

   // Tulis
   public static void tulis(String teks) {
      outFile.println(teks);
      System.out.println(teks);
   }

   // Tulis mendatar (tulis tanpa membuat baris baru)
   public static void tulisMendatar(String teks) {
      outFile.print(teks);
      System.out.print(teks);
   }

   // Tulis judul
   public static void tulisJudul(String teks) {
      int panjang = 57;
      String garisBatas = "", spasi = "";

      // Buat garis batas
      for (int i = 0; i < panjang; i++) {
         garisBatas += "=";
      }

      // Buat spasi
      for (int i = 0; i < ((panjang - teks.length()) / 2); i++) {
         spasi += " ";
      }

      tulis(garisBatas);
      tulis(spasi + teks);
      tulis(garisBatas);
   }

   // Tulis nomor rahasia
   public static void tulisNoRahasia(int[] noRahasia) {
      String teksNoRahasia = "";

      tulisMendatar("Nomor rahasia: ");

      for (int i = 0; i < noRahasia.length; i++) {
         teksNoRahasia += noRahasia[i];
      }

      tulisMendatar(teksNoRahasia);
   }

   // Tebak nomor rahasia
   public static boolean tebakNoRahasia(int[] noTebakan, int[] noRahasia) {
      // Panduan bantuan
      // Hijau		= Angka benar, posisi benar
      // Kuning	= Angka benar, posisi salah
      // Merah	   = Angka salah
      int hijau = 0, kuning = 0, merah = 0;

      // Cocokkan nomor tebakkan dengan nomor rahasia
      for (int i = 0; i < noTebakan.length; i++) {
         // Secara default beridentitas warna 'merah'
         String identitasWarna = "merah"; 

         for (int j = 0; j < noRahasia.length; j++) {
            if (noTebakan[i] == noRahasia[j]) {
               if (i == j) {
                  identitasWarna = "hijau";
               } else if (identitasWarna != "hijau") {
                  identitasWarna = "kuning";
               }
            }
         }

         switch (identitasWarna) {
            case "hijau":
               hijau++;
               break;
            case "kuning":
               kuning++;
               break;
            case "merah":
               merah++;
               break;
         }
      }

      if (hijau == noRahasia.length) {
         return true;
      }

      // Tulis panduan bantuan
      tulis("Panduan bantuan: ");
      tulis("Hijau : " + hijau);
      tulis("Kuning: " + kuning);
      tulis("Merah : " + merah);
      tulis("");

      return false;
   }

   // Buat nomor acar berdigit sesuai argumen yang diberikan
   public static int[] buatNoAcakBerdigit(int digit) {
      int[] number = new int[digit];
      int n, j, i = 1;
      boolean duplicate;

      number[0] = buatNoAcak();

      if (number.length > i) {
         do {
            n = buatNoAcak();

            for (j = i - 1; j >= 0; j--) {
               duplicate = true;

               while (duplicate) {
                  if (n == number[j]) {
                     n = buatNoAcak();
                  } else {
                     duplicate = false;
                  }
               }
            }

            number[i] = n;
            i++;
         } while (i < digit);
      }

      return number;
   }

   // Buat nomor acak
   public static int buatNoAcak() {
      Random rnd = new Random();

      return rnd.nextInt(10);
   }

   /* HELPER METHODS */
   // Tambah 0 pada awalan nomor
   public static String tambah0(int no) {
      if (no < 10) {
         return "0" + no;
      } else {
         return "" + no;
      }
   }

   // Cetak peringatan masukkan jika masukkan tidak tervalidasi
   public static void cetakPeringatanMasukkan() {
      tulis("");
      tulis("Masukkan salah, mohon coba lagi");
      tulis("");
   }
}