
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alice", 1, "Math", 3000);
        Student s1 = new Student("Bob", 101, 5000);

        School school = new School();
        school.addTeacher(t1);
        school.addStudent(s1);

        school.studentPaysFees(s1, 1500);
        t1.assignGrade(s1, 85);

        System.out.println("Total Earned: " + school.getFinance().getTotalMoneyEarned());
        System.out.println("Total Spent: " + school.getFinance().getTotalMoneySpent());
        System.out.println("Remaining Fees for " + s1.getName() + ": " + s1.getRemainingFees());
    }
}