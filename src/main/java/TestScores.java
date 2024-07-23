/*Create - accepts user input asking for two numbers between 0 and 100.
* Return astatment telling the user what score they got on a test using
* a 10 point grading scale (A,B,C,D, or F) */
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Dont forget to create an instance of the scanner!
        //ask for the number grade.
        System.out.println("Enter your number grade - out of 100:");
        int perGrade = in.nextInt();
        //Calculate letter grade and display.
        if (perGrade <= 100 && perGrade >= 90) {
            System.out.println("Your grade is an A! Good job!!");
        } else if (perGrade < 90 && perGrade >= 80) {
            System.out.println("Your grade is a B. Good job!!");
        } else if (perGrade < 80 && perGrade >= 70) {
            System.out.println("Your grade is a C. Keep practicing.");
        } else if (perGrade < 70 && perGrade >= 60) {
            System.out.println("Your grade is a D. Get some help ASAP!");
        } else if (perGrade < 60) {
            System.out.println("Your grade is an F. :(");
        } else {
            System.out.println("Invalid grade");
        }
    }
}
