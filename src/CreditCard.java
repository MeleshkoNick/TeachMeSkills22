import java.util.Scanner;

public class CreditCard {
    private String accNum;
    private double balance;

    public CreditCard(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void addMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the amount to add: ");
        double addSum = scanner.nextDouble();
        scanner.nextLine();
        this.balance += addSum;
        System.out.println("Successfully");
    }

    public void getMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the amount to withdraw: ");
        double getSum = scanner.nextDouble();
        scanner.nextLine();

        if (getSum > this.balance) {
            System.out.println("Error");
        } else {
            this.balance -= getSum;
            System.out.println("Successfully");
        }
    }

    public void getCreditCardInfo() {
        System.out.println("Your account number: " + this.accNum);
        System.out.println("Your balance: " + this.balance);
    }
}