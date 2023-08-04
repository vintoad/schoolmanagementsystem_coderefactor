package schoolmanagementsystem;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and students
 * using an ArrayList.
 * @author USER
 *
 */
public class School {

	private List <Teacher> teachers;
	private List <Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * New school object is created.
	 * @param teachers list of teachers in the school.
	 * @param students list of students in the school.
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

	/**
	 * 
	 * @return the list of teachers in the school.
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Add a teacher to a school.
	 * @param teacher is the teacher to be added.
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * 
	 * @return the list of students in the school.
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Add a student to the school
	 * @param student is the student to be added
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * 
	 * @return the total money earned by the school.
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Adds the total money earned by the school.
	 * @param MoneyEarned is the money that's supposed to be added.
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	/**
	 * 
	 * @return the total money spent by the school.
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * Update the money that's spent by the school which
	 * is the salary given by the school to its teachers
	 * @param totalMoneySpent is the money spent by the school.
	 */
	public static void updateTotalMoneySpent(int totalMoneySpent) {
		totalMoneyEarned -= totalMoneySpent;
	}
}

