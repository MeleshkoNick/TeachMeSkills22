import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int month = scanner.nextInt();
        System.out.println(seasons(month));
    }
    public static String seasons(int month) {
        switch (month) {
            case 1, 2, 12:
                return "Winter";
            case 3, 4, 5:
                return "Spring";
            case 6, 7, 8:
                return "Summer";
            case 9, 10, 11:
                return "Autumn";
            default:
                return "No, this month doesn't exist ";
        }
    }
}
