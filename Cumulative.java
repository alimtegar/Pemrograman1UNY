import java.util.ArrayList;

public class Cumulative {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(){{
            add(1);
            add(1);
            add(2);
            add(3);
            add(5);
        }};

        System.out.println(cumulative(nums));
    }
    
    public static ArrayList<Integer> cumulative(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {       // i = 1 untuk mengecualikan nilai pertama (i = 0)
            nums.set(i, nums.get(i) + nums.get(i-1)); // Kurangi nilai dengan nilai dibelakangnya
        }
    
        return nums;
    }
}
