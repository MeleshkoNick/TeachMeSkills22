package construction;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        System.out.println(even(number));
    }

    public static String even(int number) {
        if (number % 2 == 0) {
            return "construction.Even";
        } else {
            return "Odd";
        }
    }
}

