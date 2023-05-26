import java.util.Scanner;

public class MysteryNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isMysteryNumber = checkMysteryNumber(number);
        
        if (isMysteryNumber) {
            System.out.println(number + " is a mystery number!");
        } else {
            System.out.println(number + " is not a mystery number.");
        }
    }
    
    public static boolean checkMysteryNumber(int number) {
        // Convert the number to a positive value
        number = Math.abs(number);
        
        int sumOfDigits = 0;
        int productOfDigits = 1;
        
        // Calculate the sum and product of the digits
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }

        System.out.println(productOfDigits+" "+sumOfDigits);

        
        // Check if the sum and product of digits are equal
        return sumOfDigits == productOfDigits;
    }
}
