import java.util.ArrayList;

public class Intersect {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>() {
            {
                add(1);
                add(4);
                add(8);
                add(9);
                add(11);
                add(15);
                add(17);
                add(28);
                add(41);
                add(59);
            }
        };
        ArrayList<Integer> list2 = new ArrayList<Integer>() {
            {
                add(4);
                add(7);
                add(11);
                add(17);
                add(19);
                add(20);
                add(23);
                add(28);
                add(37);
                add(59);
                add(81);
            }
        };

        System.out.println(intersect(list1, list2));
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (Integer list1Item : list1) {
            if (list2.contains(list1Item)) {
                list.add(list1Item);
            }
        }

        return list;
    }
}
