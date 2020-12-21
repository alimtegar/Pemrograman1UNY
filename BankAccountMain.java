public class BankAccountMain {
   public static void main(String[] args) {
      BankAccount benben = new BankAccount();
      
      benben.name = "Benson";
      benben.deposit(800);
      benben.withdraw(900);
      
      System.out.println(benben);
      
      benben.withdraw(600);
      
      System.out.println(benben);
   }
}