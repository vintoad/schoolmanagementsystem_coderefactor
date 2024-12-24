package schoolmanagementsystem;

/**
 * Represents the financial management of the school.
 * Handles money earned, spent, and tracks the balance.
 */
public class Finance {

    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * Creates a new Finance object with initial balances set to zero.
     */
    public Finance() {
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    /**
     * Updates the total money earned by the school.
     *
     * @param amount the amount of money earned (must be positive).
     */
    public void addMoneyEarned(int amount) {
        if (amount > 0) {
            this.totalMoneyEarned += amount;
        }
    }

    /**
     * Updates the total money spent by the school.
     *
     * @param amount the amount of money spent (must be positive).
     */
    public void addMoneySpent(int amount) {
        if (amount > 0) {
            this.totalMoneySpent += amount;
        }
    }

    /**
     * Calculates the current balance of the school.
     *
     * @return the balance (total earned - total spent).
     */
    public int getBalance() {
        return totalMoneyEarned - totalMoneySpent;
    }

    // Getters
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    @Override
    public String toString() {
        return "Finance{" +
               "totalMoneyEarned=$" + totalMoneyEarned +
               ", totalMoneySpent=$" + totalMoneySpent +
               ", balance=$" + getBalance() +
               '}';
    }
}
