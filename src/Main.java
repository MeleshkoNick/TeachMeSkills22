import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard priorbank = new CreditCard("1234567890", 10000.0);

        boolean exit = false;
        while (!exit) {
            System.out.println("Select an operation:");
            System.out.println("1 - Get Credit Card Info");
            System.out.println("2 - Add Money");
            System.out.println("3 - Get Money");
            System.out.println("4 - Get Balance");
            System.out.println("5 - Exit");
            System.out.print("Choose operation: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    priorbank.getCreditCardInfo();
                    break;
                case 2:
                    priorbank.addMoney();
                    break;
                case 3:
                    priorbank.getMoney();
                    break;
                case 4:
                    System.out.println("Balance: " + priorbank.getBalance());
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Error");
            }
            System.out.println();
        }
    }
}
