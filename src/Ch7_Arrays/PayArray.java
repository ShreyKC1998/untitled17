package Ch7_Arrays;

import java.util.Scanner;

public class PayArray {
    public static void main(String[] args) {
        final int EMPLOYEE = 5; // Number of employees
        double payRate; // Hourly pay rate
        double grossPay; // Gross pay

        //Create an array to hold employee hours
        int[] hours = new int[EMPLOYEE];

        //Create a scanne object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the hours worked by " + EMPLOYEE + " employees who all earn the" +
                "same hourly rate");

        for (int i = 0; i < EMPLOYEE; i++) {
            System.out.println("Employee #" + (i+1) + ": ");
            hours[i] = input.nextInt();

        }

        //Get the hourly pay rate
        System.out.println("Enter the hourly rate for each employee");
        payRate = input.nextDouble();

        //Display each employee's gross pay
        System.out.println("Here is each employee's gross pay");
        for (int i = 0; i < EMPLOYEE; i++) {
            grossPay = hours[i] * payRate;
            System.out.println("Employee #" + (i+1) + ": $" + grossPay);

        }


    }
}
