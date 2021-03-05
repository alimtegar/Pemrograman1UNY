import java.util.ArrayList;

public class MergeIntervals {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> intervals = new ArrayList<ArrayList<Integer>>() {
            {
                add(new ArrayList<Integer>() {
                    {
                        add(1);
                        add(3);
                    }
                });
                add(new ArrayList<Integer>() {
                    {
                        add(2);
                        add(3);
                    }
                });
                add(new ArrayList<Integer>() {
                    {
                        add(4);
                        add(8);
                    }
                });
                add(new ArrayList<Integer>() {
                    {
                        add(5);
                        add(6);
                    }
                });
                add(new ArrayList<Integer>() {
                    {
                        add(7);
                        add(10);
                    }
                });
                add(new ArrayList<Integer>() {
                    {
                        add(10);
                        add(14);
                    }
                });
            }
        };

        System.out.println(mergeIntervals(intervals));
    }

    public static ArrayList<ArrayList<Integer>> mergeIntervals(ArrayList<ArrayList<Integer>> intervals) {
        for (int i = 0; i < intervals.size() - 1 ; i++) {
            ArrayList<Integer> interval = intervals.get(i);
            Integer intervalEnd = interval.get(1);

            ArrayList<Integer> nextInterval = intervals.get(i + 1);
            Integer nextIntervalStart = nextInterval.get(0);
            Integer nextIntervalEnd = nextInterval.get(1);

            if (intervalEnd >= nextIntervalEnd) {
                intervals.remove(nextInterval);
                i--;
            } else if (intervalEnd >= nextIntervalStart) {
                interval.set(1, nextIntervalEnd);
                intervals.remove(nextInterval);
                i--;
            }
        }

        return intervals;
    }
}
