import java.util.Scanner;

public class MainAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        
        // Prompt user to enter age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Calculate the number of characters in the surname
        int numCharacters = surname.length();
        
        // Output the number of characters in the surname
        System.out.println("The number of characters in your surname is: " + numCharacters);
        
        // Determine if the age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";
        
        // Output whether the age is even or odd
        System.out.println("Your current age is an " + ageType + " number.");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
