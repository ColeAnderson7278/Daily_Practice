public class Prac {
    public static void main(String[] args) {
        int[] intArray = { 0, 2, 3, 4, 5 };
        computeArray(intArray);
    }

    public static void computeArray(int[] intArray) {
        int largeInt = intArray[0];
        int smallInt = intArray[0];
        // for (int i : intArray) {
        // if (i > largeInt) {
        // largeInt = i;
        // } else if (i < smallInt) {
        // smallInt = i;
        // }
        // }
        int i = 0;
        while (i < intArray.length) {
            if (intArray[i] > largeInt) {
                largeInt = intArray[i];
            } else if (intArray[i] < smallInt) {
                smallInt = intArray[i];
            }
            i++;
        }
        System.out.println(largeInt - smallInt);
    }
}
