import java.util.ArrayList;

public class Repeat {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>() {
            {
                add("how");
                add("are");
                add("you");
            }
        };

        System.out.println(repeat(strings, 4));
        // System.out.println(repeat(strings, 0));
    }

    public static ArrayList<String> repeat(ArrayList<String> strings, int k) {
        int iCount = strings.size() * k;

        if (iCount > 0) {
            for (int i = 0; i < iCount; i += k) {
                for (int j = 1; j < k; j++) {
                    strings.add(i, strings.get(i));
                }
            }
        } else {
            strings.clear();
        }

        return strings;
    }
}