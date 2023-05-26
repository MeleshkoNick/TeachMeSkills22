package construction;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color of the rainbow: ");
        int color = scanner.nextInt();
        System.out.println(rainbow(color)); }

    public static String rainbow(int color) {
        switch (color) {
            case 1:
                return "Red";
            case 2:
                return "Orange";
            case 3:
                return "Yellow";
            case 4:
                return "Green";
            case 5:
                return "Blue";
            case 6:
                return "Dark blue";
            case 7:
                return "Purple";
            default:
                return "Wrong color number";
        }
    }
}
