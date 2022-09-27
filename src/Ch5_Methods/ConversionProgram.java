package Ch5_Methods;

import org.junit.Test;

import java.util.Scanner;

public class ConversionProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a distance in meters: ");
        double meters = input.nextDouble();

        int choice;
        do {
            System.out.println("Enter your choice");
            System.out.println("1.Convert to kilometers");
            System.out.println("2.Convert to inches");
            System.out.println("3.Convert to feet");
            System.out.println("4.Quit program");
            choice = input.nextInt();

            if (choice == 1) {
                showKilometers(meters);
            }
            if (choice == 2) {
                showInches(meters);
            }
            if (choice == 3) {
                showFeet(meters);
            }

            if (meters < 0) {
                System.out.println("Can't accept negative numbers");
            }

        } while (choice != 4);
    }

    public static void showKilometers(double meters){
        double kilometers;

        kilometers = meters * 0.001;
        System.out.println(meters + " meters is " + kilometers + " kilometers");


    }
    public static void showInches(double meters){
        double inches;
        inches = meters * 39.37;
        System.out.println(meters + " meters is " + inches + " inches");
    }

    public static void showFeet(double meters){
        double feet;
        feet = meters * 3.281;
        System.out.println(meters + " meters is " + feet + " feet");

    }

@Test
    public void test(){
        showKilometers(1);
        showFeet(1);
        showInches(1);

}
}


