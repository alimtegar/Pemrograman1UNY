import java.util.Map;
import java.util.HashMap;

public class LeastCommon {
    public static void main(String args[]) {
      Map<String, Integer> m = new HashMap<String, Integer>(){{
          put("Alyssa", 22);
          put("Char", 25);
          put("Dan", 25);
          put("Jeff", 20);
          put("Kasey", 20);
          put("Kim", 20);
          put("Mogran", 25);
          put("Ryan", 25);
          put("Stef", 22);
      }};

      System.out.println(leastCommon(m));
    }
    
    public static int leastCommon(Map<String, Integer> m) {
        if (m.isEmpty()) {
            throw new IllegalArgumentException();
        }
        
        Map<Integer, Integer> mc = new HashMap<Integer, Integer>(); 
        
        for (Integer v : m.values()) { 
            int c = 1;
            
            if (mc.containsKey(v)){
                c = mc.get(v);
                c++;
             }
            
            mc.put(v, c);
        } 
        
        int vmin = 0;
        int kmin = 0;
        
        for (Map.Entry<Integer, Integer> e : mc.entrySet()) {
            if (vmin == 0 || e.getValue() <= vmin) {
                
                
                if (e.getValue() != vmin && e.getKey() >= kmin) {
                    kmin = e.getKey();
                }
                
                vmin = e.getValue();
            }
        }
        
        return kmin;
    }
}
