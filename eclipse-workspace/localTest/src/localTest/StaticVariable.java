package localTest;

public class StaticVariable {
	int x;
	private static double salary;
	
	void test() {
	
		int re = 1004;
		System.out.println(+re);
		System.out.println(+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sv = new StaticVariable();
		sv.x = 100;

		
		System.out.println("X  = "+sv.x);
		System.out.println("Salary is: "+salary);
		sv.test();

	}

}
