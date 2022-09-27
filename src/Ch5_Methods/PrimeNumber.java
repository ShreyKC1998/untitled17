package Ch5_Methods;

import java.io.File;
import java.io.IOException;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " - " + isPrime(i));
            File test = new File("test.txt");


        }
    }

    public static boolean isPrime(int num){

        // Corner case
        if (num <= 1)
            return false;

        // Check from 2 to square root of n
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;

        return true;
    }
}
