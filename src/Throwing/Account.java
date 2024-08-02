package Throwing;

public class Account {
    String name;
    String account_number;
    double amount;

    public Account(String name, String account_number, double amount) {
        this.name = name;
        this.account_number = account_number;
        this.amount = amount;
    }

    public void withdraw(int withdraw_amount) throws InsufficientFundsException {
        if (amount < withdraw_amount) {
            throw new InsufficientFundsException("You have Insufficient Fund make sure to add money in your account");
        }

        this.amount = amount - withdraw_amount;
    }

    public String getName() {
        return name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public double getAmount() {
        return amount;
    }
}
