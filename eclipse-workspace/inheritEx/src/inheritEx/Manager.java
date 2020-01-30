package inheritEx;

class Employee{
	public String name;
	public int empid;
	
	public Employee() {
		this.name = "Kalam";
		this.empid =1;
	}
	
	
	public Employee(String name,int empid) {
		this.name = name;
		this.empid = empid;
	}
	
	String getDetils() {
		return "ID is "+ empid +" and Name is "+name;
		
	}
}

public class Manager extends Employee {
	
	public String department;
	
	public Manager(int id,String name,String deppartment) {
		super(name,id);
		this.department = deppartment;
	}
	 String getDetails() {
		return "Subdetails";
	}
	
	void print() {
		System.out.println("Name= "+name);
		System.out.println("Department= "+department);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgr = new Manager(1, "Siyam", "IT");
		mgr.print();
		System.out.println(mgr.getDetails());
		

		
	}

}
