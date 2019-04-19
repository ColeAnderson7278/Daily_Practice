import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        breakDownString(getString());
    }

    public static String getString() {
        Scanner userInput = new Scanner(System.in);
        String str = userInput.nextLine();
        userInput.close();
        return str;
    }

    public static void breakDownString(String str) {
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.println(multiplyChar(c));
        }
    }

    public static String multiplyChar(char c) {
        int position = getPositionOfChar(c);
        String finishedString = "";
        // for (int i = 0; i < position; i++) {
        // finishedString += c;
        // }
        while (position > 0){ 
            finishedString += c;
            position--;
        }
        return finishedString;
    }

    public static int getPositionOfChar(char c) {
        Character lowerC = Character.toLowerCase(c);
        int temp = (int) lowerC;
        int temp_integer = 96;
        return temp - temp_integer;
    }
}
