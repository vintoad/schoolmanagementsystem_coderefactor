import java.util.*;

public class Student {

    private String name;
    // private int id;
    private final int id;
    private int feesPaid;
    private int totalFees;
    private Map<String, Integer> grades = new HashMap<>();

    public Student(String name, int id, int totalFees) {
        this.name = name;
        this.id = id;
        this.totalFees = totalFees;
        this.feesPaid = 0;
    }

    public void payFees(int amount) {
        // this.feesPaid += amount; Kurangnya validasi
        if (amount > 0) {
            this.feesPaid += amount;
        }
    }

    public void setGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getRemainingFees() {
        return totalFees - feesPaid;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
