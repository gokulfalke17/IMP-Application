//s3-1
import java.util.Scanner;
class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	//constructor
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
}

public class EmployeeApp {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		//employee array
		Employee emp[] = new Employee[5];
		//employee class reference
		Employee e;
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter id ");
			int id = scn.nextInt();

			System.out.println("Enter Name ");
			String name = scn.next();
			scn.nextLine();

			System.out.println("Enter Salary ");
			int salary= scn.nextInt();
			emp[i] = new Employee(id,name,salary);
		}
		
		//display employee details
		System.out.println("Id \t Name \t Salary ");
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].getId()+" "+emp[i].getName()+" "+emp[i].getSalary());
		}
		System.out.println();
		
		//search key
		System.out.println("Enter Id Which Employee Details You Have :");
		int search = scn.nextInt();

		for(int i=0;i<emp.length;i++) {
			if(emp[i].getId()==search) {
				//System.out.println(emp[i].getId()+" "+emp[i].getName()+" "+emp[i].getSalary());
				System.out.println("Employee Present...");
				break;
			}else {
				System.out.println("Employee Not Present...");
				//break;
			}
		}
		
		
	}
}