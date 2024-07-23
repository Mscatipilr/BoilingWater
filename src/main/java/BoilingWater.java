//enable scanning of console inputs
import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        //create instance of scanner with variable name 'in' for later use.
        Scanner in = new Scanner(System.in);

        //Display command to console
        System.out.println("Enter a number greater than 212:");
        //Take in response as a variable
        int n = in.nextInt();
        //use conditional statement to display appropriate message
        String message = (n > 212) ? "The water is boiling!" : "The water is not boiling yet.";
        System.out.println(message);
    }
}

