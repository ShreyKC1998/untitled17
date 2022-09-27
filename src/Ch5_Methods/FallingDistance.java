package Ch5_Methods;

public class FallingDistance {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t\t" + fallDistance(i));
        }
    }

    public static double fallDistance(double seconds){

        return (.5*9.8)*(Math.pow(seconds,2));
    }
}
