public class Prac {
    public static void main(String[] args) {
        // double[] items = { 9.5, 11.75, 18.5, 3, 3 };
        // int index = 0;
        // double money = 30;
        // double[] items = { 3, 4 };
        // int index = 1;
        // double money = 4;
        // double[] items = { 1 };
        // int index = 0;
        // double money = 1;
        double[] items = { 3, 4 };
        int index = 1;
        double money = 0;
        findOwed(items, index, money);
    }

    public static void findOwed(double[] items, int index, double money) {
        double sharedTotal = 0;
        // for (int i = 0; i < items.length; i++) {
        // if (i != index) {
        // sharedTotal += items[i];
        // }
        // }
        int i = 0;
        while (i < items.length) {
            if (i != index) {
                sharedTotal += items[i];
            }
            i++;
        }
        double owed = sharedTotal / 2;
        System.out.println("Amount Back: " + (money - owed));
    }
}
