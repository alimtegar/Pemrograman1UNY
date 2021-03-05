import java.util.ArrayList;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<String> v = new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
                add("b");
                add("b");
                add("a");
                add("b");
            }
        };

        System.out.println(removeAll(v, "b"));
    }

    public static ArrayList<String> removeAll(ArrayList<String> v, String string) {
        while (v.contains(string)) {
            v.remove(string);
        }

        return v;
    }
}
