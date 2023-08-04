package schoolmanagementsystem;

/**
 * 
 * @author USER
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */
public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Creates a new teacher object.
	 * @param id is the id for the teacher
	 * @param name is the name of the teacher
	 * @param salary is the salary of the teacher
	 */
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	/**
	 * 
	 * @return the id of the teacher.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @return name of the teacher.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return the salary of the teacher.
	 */
	public int getSalary() {
		return salary;
		
	}
	
	/**
	 * Set the salary
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * Adds to salary.
	 * Removes from the total money earned by the school.
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	@Override
    public String toString() {
   	 return "Teacher's name :" + name + "\n" + 
   			 " Total salary earned so far in $:" + salaryEarned;
    }

}
