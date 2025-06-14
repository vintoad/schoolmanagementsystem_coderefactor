public class Finance {
    //Public Data 
    // public int totalMoneyEarned;
    // public int totalMoneySpent;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public void processPaymentFromStudent(int amount) {
        this.totalMoneyEarned += amount;
    }

    public void registerNewStaffSalary(int salary) {
        this.totalMoneySpent += salary;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
}