package Ch5_Methods;

import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mass: ");
        double mass = input.nextDouble();
        System.out.println("Enter the velocity: ");
        double velocity = input.nextDouble();

        System.out.println("The kinetic energy is " + kineticEnergy(mass, velocity) + " Joules");


    }

    public static double kineticEnergy(double mass, double velocity){

        return .5*mass*(Math.pow(velocity,2));
    }
}
