package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a school that manages teachers and students
 * and tracks financial information.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * Creates a new School object with lists of teachers and students.
     *
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = new ArrayList<>(teachers);
        this.students = new ArrayList<>(students);
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    // Getters and Setters
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // Business Logic
    public void addTeacher(Teacher teacher) {
        if (teacher != null) {
            teachers.add(teacher);
        }
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public void updateTotalMoneyEarned(int moneyEarned) {
        if (moneyEarned > 0) {
            this.totalMoneyEarned += moneyEarned;
        }
    }

    public void updateTotalMoneySpent(int moneySpent) {
        if (moneySpent > 0) {
            this.totalMoneySpent += moneySpent;
            this.totalMoneyEarned -= moneySpent;
        }
    }

    @Override
    public String toString() {
        return "School: \nTotal Money Earned: $" + totalMoneyEarned +
               "\nTotal Money Spent: $" + totalMoneySpent;
    }
}
