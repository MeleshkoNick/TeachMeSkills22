import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sum: ");
        float sum = scanner.nextFloat();
        System.out.print("Enter your number of months: ");
        byte month = scanner.nextByte();
        float sum2 = sum;
        for (int i = 0; i < month; i++) {
            sum2 = sum2 + sum2 /100*7f;
        }
        System.out.print(sum2);
    }
}
