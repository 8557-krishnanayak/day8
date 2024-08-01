package Custom;

import java.util.Scanner;

public class CustomUnCheckedException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the Number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new NegativeNumberException("Number should not be negative");
            }

            scanner.close();
            System.out.println("User number:\t" + number);
        } catch (NegativeNumberException e) {
            System.out.println("Invalid Number:\t" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
