import java.util.ArrayList;

public class DeleteDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>() {
            {
                add("be");
                add("be");
                add("is");
                add("not");
                add("or");
                add("question");
                add("that");
                add("the");
                add("to");
                add("to");
            }
        };

        System.out.println(deleteDuplicates(list));
    }

    public static ArrayList<String> deleteDuplicates(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            int duplicateCount = 0;
    
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    duplicateCount++;
                }
            }
    
            if (duplicateCount > 1) { 
                list.remove(i); 
                i--; // Untuk cek mundur
            }
        }
    
        return list;
    }
}
