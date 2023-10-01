import java.util.Scanner;

public class q2 {
    // Function to check if a number is odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    // Function to print all odd numbers from 1 to n
    public static void printOddNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (isOdd(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a new line after printing the odd numbers
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n >= 1) {
                System.out.println("Odd numbers from 1 to " + n + ":");
                printOddNumbers(n);
            } else {
                System.out.println("Please enter a positive integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        
        scanner.close();
    }
}

