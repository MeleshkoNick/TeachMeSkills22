import java.util.Arrays;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Enter numbers: ");
        newArray();}
        public static void newArray () {
            int[] numbers = new int[]{-15, -5, 0, 7, 12, -37, -82, 45, 32, -5, 0, -5, 15};
            int[] coped;
            int value = cin().nextInt();
            int counter = 0;

            for (int i : numbers) {
                if (i == value) {
                    counter++;
                }
            }

            if (counter == 0) {

                coped = new int[numbers.length];
                System.arraycopy(numbers, 0, coped, 0, numbers.length);
                System.out.println("Such a number isn't in the array.");
                System.out.println("The new array with the same value is: " + Arrays.toString(coped));
            } else {
                coped = new int[numbers.length - counter];
                for (int outer = 0, inner = 0; outer < numbers.length; outer++) {
                    if (numbers[outer] == value) {
                        continue;
                    }
                    coped[inner] = numbers[outer];
                    inner++;
                }
                System.out.println("Such a number is in the array.");
                System.out.println("The new array is: " + Arrays.toString(coped));
            }
        }
        public static Scanner cin () {
            return new Scanner(System.in);
        }
    }
