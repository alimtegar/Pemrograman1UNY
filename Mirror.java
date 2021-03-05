import java.util.ArrayList;

public class Mirror {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
            }
        };

        System.out.println(mirror(list));
    }

    public static ArrayList<String> mirror(ArrayList<String> list) {
        // int initSize = list.size()
        int iCount = list.size();

        for (int i = 0; i < iCount; i++) {
            list.add(list.get(iCount - 1 - i));
        };

        return list;
    }
}
