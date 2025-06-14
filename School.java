import java.util.*;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private Finance finance;

    public School() {
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.finance = new Finance();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        finance.registerNewStaffSalary(teacher.getSalary());
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void studentPaysFees(Student student, int amount) {
        student.payFees(amount);
        finance.processPaymentFromStudent(amount);
    }

    public Finance getFinance() {
        return finance;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }
}
