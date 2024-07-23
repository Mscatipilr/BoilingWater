//Compare 2 numbers via user input.
import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //facilitates collection of user input
        System.out.print("Enter the first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = in.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("The first number, " + firstNumber + ", is equal to the second number, " + secondNumber + ".");
        } else if (firstNumber > secondNumber) {
            System.out.println("The first number, " + firstNumber + ", is greater than the second number, " + secondNumber + ".");
        } else {
            System.out.println("The first number, " + firstNumber + ", is less than the second number, " + secondNumber + ".");
        }


    }
}
