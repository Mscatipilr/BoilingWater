/* Ask user for two words. Compare them, and
answer if they are the same or nah.
*/

import java.util.Scanner; //allow user input

public class SameOrNah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //instance of scanner

        //Prompt user for two words and collect the response.
        System.out.println("Enter a word:");
        String firstWord = in.nextLine().toLowerCase().trim();
        System.out.println("Enter another word:");
        String secondWord = in.nextLine().toLowerCase().trim();

        //compare words and display results
        if (firstWord.equals(secondWord)) {
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are not the same.");
        }
    }
}
