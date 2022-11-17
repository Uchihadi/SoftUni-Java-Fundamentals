package Conditions.IfElse;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // If temperature is below 0 deg, print "Freezing Weather"
        Scanner scanner = new Scanner(System.in);
        double temperature = Double.parseDouble(scanner.nextLine());

        if (temperature <= 0) {
            System.out.println("Freezing Weather");
        } else {
            System.out.println("Temperature is greater than zero.");
        }
    }
}
