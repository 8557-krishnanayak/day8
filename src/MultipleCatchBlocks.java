import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first Element");
            int first = sc.nextInt();
            System.out.println("Enter the Second Element");
            int second = sc.nextInt();

            sc.close();

            int divide = first / second;
            System.out.println(divide);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception ~ " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input is Mismatch " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
