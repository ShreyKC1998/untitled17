package Ch7_Arrays;

public class PassElements {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

        for (int number : numbers) {
            showValue(number);

        }

    }
    public static void showValue(int n){
        System.out.println(n + " ");
    }
}
