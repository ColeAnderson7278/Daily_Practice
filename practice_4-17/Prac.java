import java.util.Scanner;

class Prac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        compareStrings(input.nextLine(), input.nextLine());
        input.close();
    }

    public static void compareStrings(String strOne, String strTwo) {
        char[] strOneArray = strOne.toCharArray();
        char[] strTwoArray = strTwo.toCharArray();
        if (strOneArray.length > strTwoArray.length) {
            strTwoArray = strOne.toCharArray();
            strOneArray = strTwo.toCharArray();
        }
        // for (int i = 0; i < strOneArray.length; i++) {
        // if (strOneArray[i] == strTwoArray[i]) {
        // System.out.println(strOneArray[i]);
        // } else {
        // System.out.println(".");
        // }
        // }
        int i = 0;
        while (i < strOneArray.length) {
            if (strOneArray[i] == strTwoArray[i]) {
                System.out.println(strOneArray[i]);
            } else {
                System.out.println(".");
            }
            i++;
        }
        compareStringSizes(strOneArray.length, strTwoArray.length);
    }

    public static void compareStringSizes(int lengthOne, int lengthTwo) {
        if (lengthOne > lengthTwo) {
            for (int i = 0; i < (lengthOne - lengthTwo); i++) {
                System.out.println(".");
            }
        } else if (lengthOne < lengthTwo) {
            for (int i = 0; i < (lengthTwo - lengthOne); i++) {
                System.out.println(".");
            }
        }
    }
}
