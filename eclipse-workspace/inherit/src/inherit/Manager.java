package inherit;

class Employee{
	public String name;
	public int employeeid;
	
	String getDetails() {
		return "Id is: "+employeeid+"and Name is"+name;
	}
}


public class Manager extends Employee {
	public String department;
	
	public Manager(int id,String name,String department) {
		this.department = department;
	}
	String getDetails() {
		return "su";
	}
	public static void main(String[] args) {
		Manager mgr = new Manager(1, "Mr.A", "IT");
		mgr.print();
	}
	
	void print() {
		System.out.println("He");
	}

}
