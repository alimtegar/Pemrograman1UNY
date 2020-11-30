public class Before {
   public static void main(String[] args) {
      System.out.println(before(11, 29, 11, 30));
      System.out.println(before(12, 1, 11, 30));
      System.out.println(before(11, 29, 11, 29));
   }
   
   public static boolean before(int m1, int d1, int m2, int d2) {
      return (m1 < m2) || ((m1 == m2) && d1 < d2);
   }
}