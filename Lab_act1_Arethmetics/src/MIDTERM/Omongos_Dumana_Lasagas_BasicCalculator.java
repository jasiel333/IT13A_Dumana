
package MIDTERM;

import java.util.Scanner;
 
public class Omongos_Dumana_Lasagas_BasicCalculator {
   
    public static void main (String[] args) {
        scanner scanner = new
    scanner (system.in);
        
        system.out.println("enter first number: ");
        double num1 = scanner.nextDouble();
        
        system.out.println("enter an operator (+, -, *, /): ");
            char operator =
        scanner.next().charAt(0);
            system.out.println("enter a second number : ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            boolean valid = true;
            
            if (operator == '+'){
                result = num1 + num2;
            }   else if (operator == '-'){ 
                result = num1 - num2;
            }   else if (operator == '*') {
                result = num1 * num2 ;
            }   else if (operator == '/'){
                        if (num2 != 0) {
                        result = num1 / num2;
                        } else {
                            system.out.println("error! Division by zero is not allowed. ");
                            valid = false;
                        }
                        } else {
                                system.out.println("invalid operator! Please use +, -, *, or /.");
                                valid = false;
                                }
                        if (valid) {
                            system.out.println("the result is: " + result);
                        }
                
            }            
            }
            
    
