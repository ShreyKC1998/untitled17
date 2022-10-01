package Ch7_Arrays;

import java.util.Scanner;

public class DisplayTestScores {
    public static void main(String[] args) {

        int numTests; // The number of tests
        int[] tests; // Array of test scores

        //Create a Scanner object for keyboard input
        Scanner input = new Scanner(System.in);


        //Get the number of test scores
        System.out.println("How many tests do you have? ");
        numTests = input.nextInt();

        //Create an array to hold that number of scores
        tests = new int[numTests];

        //Get the individual test scores
        for (int i = 0; i < tests.length; i++) {
            System.out.println("Enter test score " + (i+1) + ": ");
            tests[i] = input.nextInt();

        }

        //Display the test scores
        System.out.println();
        System.out.println("Here are the scores you entered: ");
        for (int test : tests) {
            System.out.println(test + " ");

        }
        double sum = 0;
        System.out.println("Here is the average");
        for (int test : tests) {
            System.out.println((sum += test)/5.0);

        }

    }
}
