import java.util.Scanner;

public class Bank {
   public static int saldo = 0;
   public static int keluar = 0;
   public static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      do {
         // Pilih menu
         System.out.println("MENU (1. Cek Saldo, 2. Setor Tunai, 3. Tarik Tunai, 4. Transfer, 0. Keluar)");
         System.out.print("Pilih: "); 
         int pilihanMenu = sc.nextInt();
         
         System.out.println();
         
         switch(pilihanMenu) {
            case 1:
               cekSaldo();
               break;
            case 2:
               setorTunai();
               break;
            case 3:
               tarikTunai();
               break;
            case 4:
               transferTunai();
               break;
            case 0:
               keluar = konfirmasiKeluar();
               break;     
            default: 
               System.out.println("Gagal, pilihan tidak tersedia");
               break;
         }
         
         System.out.println();
      } while (keluar == 0);
   }
   
   // Cek saldo
   public static void cekSaldo() {    
      System.out.println("CEK SALDO");
      System.out.println("Saldo: Rp" + saldo); 
   } 
   
   // Setor tunai
   public static void setorTunai() {
      System.out.println("SETOR TUNAI");
      System.out.print("Jumlah setoran: ");
      int setoran = sc.nextInt();
      
      System.out.println();
      
      if (setoran > 0) {
         saldo += setoran;
         
         System.out.println("Sukses, Rp" + setoran + " telah disetorkan ke saldo rekening");
      } else {
         System.out.println("Gagal, setoran harus lebih dari Rp0");
      }
      
      System.out.println();
      
      // Cek saldo 
      cekSaldo(); 
   }
   
   // Tarik tunai
   public static void tarikTunai() {
      System.out.println("TARIK TUNAI");
      System.out.print("Jumlah penarikan: ");
      int penarikan = sc.nextInt();
      
      System.out.println();
      
      if (saldo >= penarikan) {
         saldo -= penarikan;
         
         System.out.println("Sukses, Rp" + penarikan + " telah ditarik dari saldo rekening");
      } else {
         System.out.println("Gagal, saldo tidak cukup");
      }
      
      System.out.println();
      
      // Cek sisa saldo 
      cekSaldo();
   }
   
   // Transfer tunai
   public static void transferTunai() {
      System.out.println("TRANSFER TUNAI"); 
      System.out.print("No. rekening tujuan: ");
      String noRekTujuan = sc.next();
      
      System.out.print("Jumlah transfer: ");
      int transfer = sc.nextInt();
      
      System.out.println();
      
      if (saldo >= transfer) {
         saldo -= transfer;
         
         System.out.println("Sukses, Rp" + transfer + " telah ditransferkan ke no. rekening " + noRekTujuan);
      } else {
         System.out.println("Gagal, saldo tidak cukup");
      }
      
      System.out.println();
      
      // Cek sisa saldo 
      cekSaldo();
   }  
   
   // Konfirmasi keluar 
   public static int konfirmasiKeluar() {
      System.out.println("KONFIRMASI KELUAR (0. Tidak/1. Ya)");
      System.out.print("Pilih: ");
      keluar = sc.nextInt();
      
      return keluar;
   }
}