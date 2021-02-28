import java.util.ArrayList;

public class AddStars {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(){{
            add("the");
            add("quick");
            add("brown");
            add("fox");
        }};

        System.out.println(addStars(list));
    }

    public static ArrayList<String> addStars(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, "*"); // Menambahkan nilai "*" di nilai di belakangnya 
        }

        list.add(list.size(), "*"); // Menambahkan nilai "*" terakhir

        return list;
    }
}