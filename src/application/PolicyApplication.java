package application;

public class PolicyApplication {
    private int age;
    private String driving_history;
    private String health_records;

    public PolicyApplication(int age, String driving_history, String health_records) {
        this.age = age;
        this.driving_history = driving_history;
        this.health_records = health_records;
    }

    public void ageValidation() throws InvalidAgeException {
        if (this.age < 18 || this.age > 75) {
            throw new InvalidAgeException("Age must be between 18 to 75");
        }
    }

    public void drivingHistoryValidation() throws PoorDrivingRecordException {
        if (this.driving_history.contains("accident") || this.driving_history.contains("violation")) {
            throw new PoorDrivingRecordException("Poor driving record detected");
        }
    }

    public void healthHistoryValidation() throws HealthIssueException {
        if (this.health_records.contains("serious")) {
            throw new HealthIssueException("Health Issue detected");
        }
    }

    @Override
    public String toString() {
        return "PolicyApplication{" +
                "age=" + age +
                ", driving_history='" + driving_history + '\'' +
                ", health_records='" + health_records + '\'' +
                '}';
    }
}
