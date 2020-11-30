public class SameDashes {
   public static void main(String[] args) {
      System.out.println(sameDashes("hi--there-you.", "12--(134)-7539"));
      System.out.println(sameDashes("-15-389", "206)555-1384"));
      System.out.println(sameDashes("criminal-plan", "-xy-zzy"));
      System.out.println(sameDashes("abc", "9.8"));
   }
   
   public static boolean sameDashes(String str1, String str2) {
      return getIList(str1, "-").equals(getIList(str2, "-"));
   }
   
   public static String getIList(String str, String ch) {
        String iList = "";
        
        for(int i = 0; i < str.length(); i++) {
            iList += (str.charAt(i) == ch.charAt(0)) ? i + "," : "";
        }
        
        return iList;
    }
}