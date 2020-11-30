public class HasMidpoint {
   public static void main(String[] args) {
      System.out.print(hasMidpoint(3, 7, 5));
   }
   
   public static boolean hasMidpoint(int n1, int n2, int n3) {
      return (n1-n2 == n2-n3) || (n1-n3 == n3-n2) || (n2-n1 == n1-n3);
   }
}