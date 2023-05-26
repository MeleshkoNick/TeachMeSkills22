import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        System.out.println(getSum(number)); }
    public static int getSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++){
        sum += i; }
        return sum;
    }
}
