package Ch7_Arrays;

import java.util.Scanner;

public class PassArray {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;

        //Create an array
        int[] numbers = new int[ARRAY_SIZE];

        //Pass the array to the getValues method
        getValues(numbers);

        System.out.println("Here are the numbers that you entered: ");

        //Pass the array to the showArray method
        showArray(numbers);
    }

    private static void getValues(int[] array){
        //Create a scanner objects for keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a series of " + array.length + " numbers");

        //Read values into the array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number " + (i+1) + ": ");
            array[i] = input.nextInt();

        }
    }

    public static void showArray(int[] array){
        //Display the array elements
        for (int j : array) {
            System.out.println(j + " ");

        }
    }
}
