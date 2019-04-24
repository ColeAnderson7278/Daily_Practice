public class Prac {
    public static void main(String[] args) {
        int[] intArray = { 1, -2, 2, -2, 2, -2, 0, 1, 0 };
        computeArray(intArray);
    }

    public static void computeArray(int[] intArray) {
        int lastLevel = 0;
        int currentLevel = 0;
        int dips = 0;
        for (int i : intArray) {
            lastLevel = currentLevel;
            currentLevel = currentLevel + i;
            if (currentLevel >= 0 && lastLevel < 0) {
                dips++;
            }
        }
        System.out.println(dips);
    }
}
