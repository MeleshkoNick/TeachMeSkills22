package Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("7777777", "Nokia", 0.3);
        Phone phone2 = new Phone("5675676", "Samsung");
        Phone phone3 = new Phone();

        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.model);
        System.out.println("Weight: " + phone1.weight);
        phone1.receiveCall("Andrey");
        System.out.println();

        System.out.println("Phone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.model);
        System.out.println("Weight: " + phone2.weight);
        phone2.receiveCall("Vladimir", "5697046");
        System.out.println();

        System.out.println("Phone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.model);
        System.out.println("Weight: " + phone3.weight);
        phone3.receiveCall("Nicholas");
        System.out.println();
        phone1.sendMessage("0565567", "8636967", "4335353  ");
    }
}
