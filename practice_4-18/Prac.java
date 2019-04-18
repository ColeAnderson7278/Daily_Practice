import java.util.Scanner;

class Prac {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        compareInts(userInput.nextInt(), userInput.nextInt());
        userInput.close();
    }

    public static void compareInts(int numOne, int numTwo) {
        // int counter = 1;
        // while (counter < numTwo + 1) {
        // int product = numOne * counter;
        // System.out.println(numOne + " x " + counter + " = " + product);
        // counter++;
        // }
        for (int i = 1; i < numTwo + 1; i++) {
            int product = numOne * i;
            System.out.println(numOne + " x " + i + " = " + product);
        }
    }
}
