
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the first numberfrom user 
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Ask for the operation 
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        // Ask for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform the operation and display the result
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                scanner.close();
                return;
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
