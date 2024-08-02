package application;

public class Main {
    public static void main(String[] args) {
        PolicyApplication p1 = new PolicyApplication(20, "accident", "healthy");


        try {
            p1.ageValidation();
            p1.drivingHistoryValidation();
            p1.healthHistoryValidation();

            System.out.println("CLAIM APPROVE:\t" + p1);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException:\t" + e.getMessage());
        } catch (PoorDrivingRecordException e) {
            System.out.println("PoorDrivingRecordException:\t" + e.getMessage());
        } catch (HealthIssueException e) {
            System.out.println("HealthIssueException:\t" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception:\t" + e.getMessage());
        }
    }
}
