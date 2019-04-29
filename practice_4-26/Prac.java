import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac {
    public static void main(String[] args) {
        String note = "He old";
        String magazine = "Hello World";
        System.out.println(canNoteBeMade(note.replaceAll(" ", ""), magazine.replaceAll(" ", "")));
    }

    public static boolean canNoteBeMade(String note, String magazine) {
        List<String> noteList = new ArrayList<String>(Arrays.asList(note.split("")));
        List<String> magList = new ArrayList<String>(Arrays.asList(magazine.split("")));
        // for (String c : noteList) {
        // if (magList.contains(c)) {
        // magList.remove(c);
        // } else {
        // return false;
        // }
        // }
        int i = 0;
        while (i < noteList.size()) {
            if (magList.contains(noteList.get(i))) {
                magList.remove(noteList.get(i));
            } else {
                return false;
            }
            i++;
        }
        return true;
    }
}
