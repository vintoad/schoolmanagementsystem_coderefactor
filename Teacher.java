public class Teacher {
    private String name;
    private int id;
    private String subject;
    private int salary;

    public Teacher(String name, int id, String subject, int salary) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.salary = salary;
    }

    public void assignGrade(Student student, int grade) {
        student.setGrade(this.subject, grade);
    }

    public int getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}