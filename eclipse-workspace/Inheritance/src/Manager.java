
class Employee{
	public String name;
	public int employeeid;
	
	String getDetails() {
		return "Id is: "+employeeid+"and Name is: "+name;
	}
}
public class Manager extends Employee{
	public String departmant;
	
	public Manager(int id,String name, String department) {
		this.departmant = department;
	}

	@Override
	String getDetails() {
		return "Sub";

	}

}
