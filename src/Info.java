import java.util.Scanner;
public class Info {
    public static void main(String[] args) {
        infoKeyBoard();
        printChar();
        BMI();
    }
    public static void infoKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        System.out.println();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.println();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        System.out.println();
        System.out.print("Weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Your name: " +name);
        System.out.println("Your surname: " +surname);
        System.out.println("Your age: " +age);
        System.out.println("Your height: " +height);
        System.out.println("Your weight: " +weight);
    }
    public static void printChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your char: ");
        char symbol = scanner.next().charAt(0);
        System.out.println("Char: " + symbol + "-" + (int)symbol);
    }
    public static void BMI(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your height: ");
            int height = scanner.nextInt();
            System.out.print("Your weight: ");
            double weight = scanner.nextDouble();
            double bmi = weight/(Math.pow(height * 0.01, 2));
            System.out.println("Your BMI: " + bmi);
        }
}
