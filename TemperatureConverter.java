
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
        char unit = input.next().charAt(0);

        double convertedTemperature;

        if (unit == 'C' || unit == 'c') {
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
        } else if (unit == 'F' || unit == 'f') {
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(temperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
        } else {
            System.out.println("Invalid unit of measurement. Please enter C or F.");
            return; // Exit the program if the input is invalid
        }
        input.close(); // Close the scanner to prevent resource leaks. Important!
    }
}
