import java.util.ArrayList;

public class CountInRange {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<Integer>(){{            
            add(28);
            add(1);
            add(17);
            add(4);
            add(41);
            add(9);
            add(59);
            add(8);
            add(31);
            add(30);
            add(25);
        }};

        System.out.println(countInRange(v, 10, 30));
    }

    public static int countInRange(ArrayList<Integer> v, int min, int max) {
        int count = 0;
    
        // Untuk mengeluarkan setiap nilai v menjadi vItem
        for (int vItem : v) {
            if(vItem >= min && vItem <= max) {
                count++;
            }
        }
    
        return count;
    }
}
