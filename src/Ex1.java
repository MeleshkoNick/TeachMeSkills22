import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        arraysThree();
    }

    public static void arraysThree() {
        int [][][] arrayThree = new int [][][] {
                {
                        {1,2,3}
                },
                {
                        {4},
                        {-1,-2,1,2}
                },
                {
                        {5},
                        {6,7},
                        {8,9,10,11},
                        {1,2}
                }
        };
        System.out.println(Arrays.deepToString(arrayThree));
        System.out.println();
        System.out.print("Enter any number: ");
        int value = cin().nextInt();
        for (int outer = 0; outer < arrayThree.length; outer++) {
            for (int middle = 0; middle < arrayThree[outer].length; middle++) {
                for (int inner = 0; inner < arrayThree[outer][middle].length; inner++) {
                    arrayThree[outer][middle][inner] += value;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(arrayThree));
    }

    public static Scanner cin() {
        return new Scanner(System.in);
    }
}
