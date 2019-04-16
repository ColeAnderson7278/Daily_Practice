import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        breakDownInput(getPositiveInt());

    }

    public static int getPositiveInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive, whole number:");
        while (!input.hasNextInt()) {
            System.out.println("Please enter a positive, whole number.");
            input.nextLine();
        }
        int inputNumber = input.nextInt();
        input.close();
        return inputNumber;
    }

    public static void breakDownInput(int input) {
        int newInput = input - 1;
        while (newInput > 0) {
            System.out.println(input - newInput + " " + isFactorOf(input, (input - newInput)));
            newInput -= 1;
        }
        System.out.println("Done");
        // for (int i = 1; i < input; i++) {
        // System.out.println(i + " " + isFactorOf(input, i));
        // }
        // System.out.println("Done");
    }

    public static String isFactorOf(int input, int newInput) {
        if (input % newInput == 0) {
            return "Is a factor of " + input;
        } else {
            return "Is not a factor of " + input;
        }
    }
}
