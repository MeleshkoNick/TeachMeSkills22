import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.print("Enter length: ");
        int[] numbers = new int[cin().nextInt()];

        Random random = new Random();
        double min;
        double max;
        double sum;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.round(Math.random() * 10);
        }

        System.out.println(Arrays.toString(numbers)); }
    public static Scanner cin () {
        return new Scanner(System.in);
    }
}
