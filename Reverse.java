import java.util.Map;
import java.util.HashMap;

public class Reverse {
    public static void main(String args[]) {
      Map<Integer, String> m = new HashMap<Integer, String>(){{
          put(42, "Marty");
          put(81, "Sue");
          put(17, "Ed");
          put(31, "Dave");
          put(56, "Ed");
          put(3, "Marty");
          put(29, "Ed");
      }};

      System.out.println(reverse(m));
    }
    
    public static Map<String, Integer> reverse(Map<Integer, String> m) {
        Map<String, Integer> rm = new HashMap<String, Integer>();
        
        for (Integer k : m.keySet()) {
            rm.put(m.get(k), k);
        }
        
        return rm;
    }
}
