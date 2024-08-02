package Throwing;

public class ThrowingException {
    public static void main(String[] args) {
        Account a1 = new Account("Krishna", "987654321456789543", 1_000d);


        try {
            a1.withdraw(100);
            System.out.println("Balance:\t"+a1.getAmount()); // 900
            a1.withdraw(500);
            System.out.println("Balance:\t"+a1.getAmount()); // 400

            a1.withdraw(600);
            System.out.println("Balance:\t"+a1.getAmount()); //

        } catch (InsufficientFundsException e) {
            System.out.println("InsufficientFundsException:\t" + e.getMessage());
            System.out.println("balance\t"+a1.getAmount());

        } catch (Exception e) {
            System.out.println("Exception:\t" + e.getMessage());
        }
    }
}
