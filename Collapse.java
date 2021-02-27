import java.util.Arrays;

public class Collapse {
    public static void main(String args[]) {
        int[] nums = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
        System.out.print(Arrays.toString(collapse(nums)));
    }

    public static int[] collapse(int[] nums) {
        int x = nums.length / 2, y = nums.length % 2;
        int[] newNums = new int[x + y];

        for (int i = 0; i < x; i++) {
            newNums[i] = nums[2 * i] + nums[2 * i + 1];
        }

        if (y != 0) {
            newNums[newNums.length - 1] = nums[nums.length - 1];
        }

        return newNums;
    }
}
