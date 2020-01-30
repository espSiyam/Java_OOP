package localTest;

public class Local_Instance {
	
	int y;
	
	public void calAge() {
		int age = 0;
		age = age + 7;
		y = y+3;
		System.out.println("Age is :"+age);
		System.out.println("Value of y is :"+y);
	}

	public static void main(String[] args) {
		Local_Instance test = new Local_Instance();
		test.calAge();
				

	}

}
