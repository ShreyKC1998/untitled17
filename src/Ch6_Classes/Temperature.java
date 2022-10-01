package Ch6_Classes;

import java.util.Scanner;

public class Temperature {
    private double ftemp;

    public Temperature(double ftemp){
        this.ftemp = ftemp;
    }

    public double getFtemp() {
        return ftemp;
    }

    public void setFtemp(double ftemp) {
        this.ftemp = ftemp;
    }
    public static double getCelsius(double ftemp){

        return (5.0/9) * (ftemp -32);
    }
    public static double getKelvin(double ftemp){
        return ((5.0/9) * (ftemp-32)) + 273;
    }

    @Override
    public String toString() {
        return getFtemp() + " Fahrenheit is " + getCelsius(ftemp) + " Celsius\n" +
                " and " + getFtemp() + " Fahrenheit is also " + getKelvin(ftemp) + " Kelvin";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit: ");
        double faren = input.nextDouble();
        Temperature temp = new Temperature(faren);

        System.out.println(temp);
    }
}
