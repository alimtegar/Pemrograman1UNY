import java.util.ArrayList;

public class Mean {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<Double>() {
            {
                add(2.0);
                add(4.5);
                add(6.5);
                add(1.0);
            }
        };

        System.out.println(mean(nums));
    }

    public static double mean(ArrayList<Double> nums) {
        double sum = 0.0;
        double count = nums.size() > 0 ? nums.size() : 1;

        for (Double num : nums) { sum += num; }

        return sum / count;
    }
}
