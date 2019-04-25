import java.util.ArrayList;

public class Prac {
    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<String>();
        strArr.add("a");
        strArr.add("b");
        strArr.add("c");
        strArr.add("a");
        strArr.add("b");
        strArr.add("b");
        strArr.add("a");
        System.out.println(computeArray(strArr));
    }

    public static int computeArray(ArrayList<String> strArr) {
        ArrayList<String> newArr = new ArrayList<String>();
        int matches = 0;
        // for (String s : strArr) {
        // if (newArr.contains(s)) {
        // newArr.remove(s);
        // matches++;
        // } else {
        // newArr.add(s);
        // }
        // }
        int i = 0;
        while (i < strArr.size()) {
            if (newArr.contains(strArr.get(i))) {
                newArr.remove(strArr.get(i));
                matches++;
            } else {
                newArr.add(strArr.get(i));
            }
            i++;
        }
        return matches;
    }
}
