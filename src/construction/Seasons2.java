package construction;
import java.util.Scanner;
public class Seasons2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int month = scanner.nextInt();
        System.out.println("Seasons: " +seasons(month));
    }
    public static String seasons(int month) {
        if (month == 1 || month == 2 || month == 12) {
            return "Winter";
        } else if (month == 3 || month == 4 || month == 5) {
            return "Spring";
        } else if (month == 6 || month == 7 || month == 8) {
            return "Summer";
        } else if (month == 9 || month == 10 || month == 12) {
            return "Autumn";
        } else {
            return "Enter a valid month number";
        }
    }
}