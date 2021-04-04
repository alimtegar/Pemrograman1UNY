import java.util.Map;
import java.util.HashMap;

public class HasDuplicateValue {
    public static void main(String args[]) {
      Map<String, String> m = new HashMap<String, String>(){{
          put("Marty", "Stepp");
          put("Stuart", "Reges");
          put("Jessica", "Miller");
          put("Amanda", "Camp");
          put("Meghan", "Miller");
          put("Hal", "Perkins");
      }};

      System.out.println(hashDuplicateValue(m));
    }
    
    public static boolean hasDuplicateValue(Map<String, String> m) {
        Map<String, String> mx = new HashMap<String, String>();
        
        for (String v : m.values()) {
            if (!mx.containsValue(v)) {
                mx.put(v, v);
            }
        }
        
        return m.size() != mx.size();
    }
}
