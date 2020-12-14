public class ArrayReference {
    public static void main(String[] args) {
        int[] nums = {2, 4, -1, 3};
        incrementAll(nums);

        // HERE!
    }

    public static void incrementAll(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i]++;
        }
    }
}