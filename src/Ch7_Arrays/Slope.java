package Ch7_Arrays;

import org.junit.Test;

import java.util.Scanner;

public class Slope {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter point x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter point y1: ");
        double y1 = input.nextDouble();

        System.out.println("Your first coordinate is ("+x1+","+y1+")");

        System.out.print("Enter point x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter point y2: ");
        double y2 = input.nextDouble();
        System.out.println("Your second coordinate is ("+x2+","+y2+")");

        double top = y2-y1;
        double bottom = x2-x1;

        double slope = top/bottom;

        if(top == 0){
            System.out.println("The slope is zero");
        }
        if(top >= 1.0  && bottom == 1.0){
            System.out.println(top);
        }
        if(top < 0.0 && bottom == 1.0){
            System.out.println(top);
        }
        else
            System.out.println("The slope is " + convertDecimalToFraction(slope));




    }
    static private String convertDecimalToFraction(double x){
        if (x < 0){
            return "-" + convertDecimalToFraction(-x);
        }
        double tolerance = 1.0E-6;
        double h1=1;
        double h2=0;
        double k1=0;
        double k2=1;
        double b = x;
        do {
            double a = Math.floor(b);
            double aux = h1;
            h1 = a*h1+h2;
            h2 = aux;
            aux = k1;
            k1 = a*k1+k2;
            k2 = aux;
            b = 1/(b-a);
        } while (Math.abs(x-h1/k1) > x*tolerance);

        return h1+"/"+k1;
    }

    @Test
    public void test(){
        double x = 6.666667;
       // if(x < 0){
            //return "-" + convertDecimalToFraction(-x);
       // }
        double tolerance = 1.0E-6;
        double h1 = 1;
        double h2 = 0;
        double k1 = 0;
        double k2 = 1;
        double b = x;

        double a = Math.floor(b);
        //Approximate decimal whole number
        System.out.println(a);
        double aux = h1;
        System.out.println(aux);
        h1 = a*h1+h2;
        System.out.println(h1);
        h2 = aux;
        System.out.println(h2);
        aux = k1;
        System.out.println(aux);

       // return null;
    }
}
