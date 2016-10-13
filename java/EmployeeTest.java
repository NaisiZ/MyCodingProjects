package Set2_Exercise;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		 System.out.println("Enter the first name: ");
		 String fname = S.next();
		 System.out.println("Enter the last name: ");
		 String lname = S.next();
		 System.out.println("Enter the Monthly Salary: ");
		 double sal = S.nextDouble();
		 Employee e =new Employee(fname,lname ,sal );
		System.out.println("The current salary of "+e.getFirstName()+" "
		 +e.getLastName()+" is:");
		 System.out.println(e.getMonthlySalary()*12);
		double newsalary=
		e.getMonthlySalary()*0.1+e.getMonthlySalary();
		 e.setMonthlySalary(newsalary);
		 System.out.println("The new yearly salary of "+
		e.getFirstName()+" "+e.getLastName()+" will be:");
		 System.out.println(e.getMonthlySalary()*12);
		 e.getMonthlySalary();


	}

}
