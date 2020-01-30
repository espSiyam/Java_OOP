
class Account{
	
	int a;
	String b;
	
	public Account(int a,String b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	public void showData() {
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
	
}

public class ObjArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj [] = new Account[2];
		obj[0] = new Account(1,"Dhaka");
		obj[1] = new Account(2,"Bash");
		
		obj[0].showData();
		obj[1].showData();

	}

}
