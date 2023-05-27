import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        for (int j = 0; j <10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(j + "*" + i + "=" + (j * i) + " ");
            }
            System.out.println();
        }
    }
}
