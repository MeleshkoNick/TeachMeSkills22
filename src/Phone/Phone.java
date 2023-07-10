package Phone;

public class Phone {
    public String number;
    public String model;
    public double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("Empty", "Empty", 0.0);
    }

    public void receiveCall(String callerName) {
        System.out.println("Call from: " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Call from: " + callerName + "\n" + "Number: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String ... numbers) {
        System.out.println("Message for:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}