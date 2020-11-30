public class BooleanZen {
   public static void main(String[] args) {
      System.out.println(isVowel("a"));
      System.out.println(isVowel("b"));
      System.out.println(isVowel("c"));
      System.out.println(isVowel("d"));
      System.out.println(isVowel("e"));
   }

   public static boolean isVowel(String s) {
      s = s.toLowerCase();
      
      return s.equals("a") || 
             s.equals("e") || 
             s.equals("i") || 
             s.equals("o") || 
             s.equals("u");
   }
}