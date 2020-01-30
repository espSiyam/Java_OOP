package localTest;

public class InstanceVariable {
	public String name;
	private double salary;
	
	public InstanceVariable (String empName) {
		name = empName;
	}
	
	public void setSalary(double empSal) {
		salary = empSal;
	}
	
	public void printEmp() {
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable empOne = new InstanceVariable("Bari");
		
		empOne.setSalary(500);
		empOne.printEmp();
		
		

	}

}
