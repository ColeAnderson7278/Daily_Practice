public class Prac {
    public static void main(String[] args) {
        int[] intArray = { 1, 1, 0, 0, 0 };
        System.out.println(computeArray(intArray));
    }

    public static boolean computeArray(int[] intArray) {
        int zeros = 0;
        int ones = 0;
        for (int i : intArray) {
            if (i == 1) {
                ones++;
            } else if (i == 0) {
                zeros++;
            }
        }
        // int i = 0;
        // while (i < intArray.length) {
        // if (intArray[i] == 1) {
        // ones++;
        // } else if (intArray[i] == 0) {
        // zeros++;
        // }
        // i++;
        // }
        return ones > zeros;
    }
}
