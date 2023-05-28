package construction;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your temperature: ");
        int temperature = scanner.nextInt();
        System.out.println("Your temperature: " +yourTemperature(temperature)); }
    public static String yourTemperature(int temperature) {
        if (temperature > -5) {
            return  "Warm";
        } else if (temperature > -20 && temperature <= -5) {
            return "Normal";
        } else {
             return "Cold";
        }
    }
}
