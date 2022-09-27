package Ch5_Methods;

import org.junit.Test;

import java.util.Scanner;

public class PresentValue {
    public static void main(String[] args) {
        /**
         * P is the present value, or the amount that you need to deposit today
         * F is the future value that you want in the account(In this case, F is $10,000)
         * r is the annual interest rate
         * n is the number of years that you plan to let the money sit in the account
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the future value: ");
        double future = input.nextDouble();
        System.out.println("Enter the Annual Interest Rate: ");
        double air = input.nextDouble();
        System.out.println("Enter number of years: ");
        double years = input.nextDouble();

        System.out.println("Present value is " + presentValue(future, air,years));

    }

    public static double presentValue(double F,
                                      double r,
                                      double n){
        double paren = (1 + r);
        return F / (Math.pow(paren,n));

    }
    @Test
    public void test(){
        presentValue(900,.10,3);
        System.out.println(presentValue(10000,.02,10));
    }

}
