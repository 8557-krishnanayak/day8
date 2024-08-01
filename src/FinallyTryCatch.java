import java.util.Scanner;

public class FinallyTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the Divisor number for division: ");
            int divisor = sc.nextInt();

            sc.close();

            int number = 100 / divisor;
            System.out.println(number);

        } catch (ArithmeticException e) {
            System.err.println("Can't Divide any number with 0");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execution is completed");
        }
    }
}
