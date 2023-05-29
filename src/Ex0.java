import java.util.Scanner;

public class Ex0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("This number is exist in this array");
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("This number isn't exist in this array");
        }
    }
}
