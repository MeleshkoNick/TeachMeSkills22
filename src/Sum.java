import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        sum(number); }
    public static void sum(int number) {
        for (int i = 1; i < number; i++)
            System.out.println(i);
    }
}
