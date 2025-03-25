
package MIDTERM;

import java.util.Scanner;

public class Omongos_Dumana_Lasagas_BasicCalculator {

    public static void main(String[] args) {
        // Fixing the Scanner object declaration and capitalization issues
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the first number
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Prompt user for the operator
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Prompt user for the second number
        System.out.println("Enter a second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean valid = true;
        
        // Performing calculation based on the operator
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero is not allowed.");
                valid = false;
            }
        } else {
            System.out.println("Invalid operator! Please use +, -, *, or /.");
            valid = false;
        }
        
        // Output the result if the operator was valid
        if (valid) {
            System.out.println("The result is: " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
