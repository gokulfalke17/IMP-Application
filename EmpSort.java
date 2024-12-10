import java.util.Scanner;
class Company {

	private int id;
	private String name;
	private int salary;

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

}

public class EmpSort {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Company comp[] = new Company[5];
		for(int i=0;i<5;i++) {
			comp[i] = new Company();
			System.out.println("Enter Employee Id :");
			int id = scn.nextInt();
			scn.nextLine();
			System.out.println("Enter Employee Name :");
			String name = scn.nextLine();
			System.out.println("Enter Employee Salary :");
			int salary = scn.nextInt();

			//set values
			comp[i].setId(id);
			comp[i].setName(name);
			comp[i].setSalary(salary);
		}
		System.out.println();
		System.out.println("Employee Details are ");
		for(int i=0;i<comp.length;i++) {
			System.out.println("Id : "+comp[i].getId()+" Name : "+comp[i].getName()+" Salary : "+comp[i].getSalary());
		}

		//sort employee record by salary wise

		for(int i=0;i<comp.length;i++) {
			for(int j=i+1;j<comp.length;j++) {
				if(comp[i].getSalary() > comp[j].getSalary()) {
					Company temp = comp[i];
					comp[i] = comp[j];
					comp[j] = temp;
				}
			}
		}

		System.out.println("After Sorted Employee Details ");
		for(int i=0;i<comp.length;i++) {
			System.out.println("Id : "+comp[i].getId()+" Name : "+comp[i].getName()+" Salary : "+comp[i].getSalary());
		}
		
	}
}