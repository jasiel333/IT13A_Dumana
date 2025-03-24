
package MIDTERM;
 
public class Omo_Dum_Las {
   
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
            
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2 ;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    system.out.println("error! Division by zero is not allowed. ");
                    valid = false;
                }
            }
            default -> {
                system.out.println("invalid operator! Please use +, -, *, or /.");
                valid = false;
            }
        }
                        if (valid) {
                            system.out.println("the result is: " + result);
                        }
                
            }            
            }
            
    
