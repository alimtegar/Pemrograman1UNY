import java.util.ArrayList;

public class Stretch {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<Integer>() {
            {
                add(18);
                add(7);
                add(4);
                add(24);
                add(11);
            }
        };

        System.out.println(stretch(v));
    }

    public static ArrayList<Integer> stretch(ArrayList<Integer> v) {
        int iCount = v.size() * 2;

        for (int i = 0; i < iCount; i += 2) {
            int half = v.get(i) / 2;

            v.set(i, v.get(i) - half);
            v.add(i + 1, half);
        }

        return v;
    }
}
