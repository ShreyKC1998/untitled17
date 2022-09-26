package Ch5_Methods;

import java.util.Scanner;

public class RetailPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter wholesale cost: ");
        double wholesale = input.nextDouble();
        System.out.println("Enter the markup percentage: ");
        double markupPercentage = input.nextDouble();

        System.out.println("Wholesale cost: " + wholesale + "\n" +
                           "Markup percentage: " + markupPercentage + "\n" +
                            "Retail price: $" + calculateRetail(wholesale, markupPercentage));

    }

    public static double calculateRetail(double cost, double markup){

        double markupConvert = markup /100.0;

        return (cost * markupConvert) + cost;
    }
}
