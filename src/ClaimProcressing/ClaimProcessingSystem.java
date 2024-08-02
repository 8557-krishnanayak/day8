package ClaimProcressing;

public class ClaimProcessingSystem {


    public static void processClaim(double amount, String date, ClaimDetails c) throws InvalidClaimAmountException, FraudulentClaimException {
        if (c.amount > amount && amount < 0) {
            throw new InvalidClaimAmountException("Amount is higher than Claim Amount");
        }

//        System.out.println(date.compareTo(c.startDate));
//        System.out.println(date.compareTo(c.endDate));

        if (date.compareTo(c.startDate) > 0 && date.compareTo(c.endDate) < 0) {
            throw new FraudulentClaimException("Date Does not match");
        }
    }


    public static void main(String[] args) {
        ClaimDetails c1 = new ClaimDetails(12_343d, "2024-03-11", "2025-04-11");

        try {
            processClaim(10000, "2024-02-12", c1);
            System.out.println("CLAIM APPROVED 🤞🤞");
        } catch (InvalidClaimAmountException | FraudulentClaimException e) {
            System.out.println("Claim Deny:\t" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }

    }
}
