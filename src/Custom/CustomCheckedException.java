package Custom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomCheckedException {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the age of the User: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Age must be greater than 18");
            }

            scanner.close();
            System.out.println("User age:\t" + age);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
