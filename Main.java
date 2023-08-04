package schoolmanagementsystem;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author USER
 *
 */
public class Main {

	public static void main(String[] args) {
		Teacher Lizzy = new Teacher(1, "Lizzy", 500);
		Teacher Nelly = new Teacher(2, "Nelly", 700);
		Teacher Tom = new Teacher(3, "Tom", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Lizzy);
		teacherList.add(Nelly);
		teacherList.add(Tom);
		
		Student Tamara = new Student(1, "Tamara", 4);
		Student Mary = new Student (3, "Mary", 5);
		Student Hawkins = new Student(2, "Hawkins", 12);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(Tamara);
		studentList.add(Mary);
		studentList.add(Hawkins);
		
        School mhs = new School(teacherList, studentList);
        
        
        Tamara.payFees(5000);
        Mary.payFees(6000);
        System.out.println("MHS has earned $" + mhs.getTotalMoneyEarned());
        
        System.out.println("------Making SCHOOL PAY SALARY-----");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("MHS has spent money for salary to " + Lizzy.getName()
        + " and now has $" + mhs.getTotalMoneyEarned());
        
        Nelly.receiveSalary(Nelly.getSalary());
        System.out.println("MHS has spent money for salary to " + Nelly.getName()
        + " and now has $" + mhs.getTotalMoneyEarned());
        
        System.out.println(Tamara);
        System.out.println(Nelly);
        
	}

}
