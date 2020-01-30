
public class Example1 {
	int data = 50;
	
	void change(int data) {
		data = data+100;
		System.out.println("Data in method: "+data);
		
	}
	
	void changeByObj(Example1 e) {
		e.data = 200;
	}
	public static void main(String[] args)  {
		
		Example1 ex = new Example1();
		
		System.out.println(+ex.data);
		
		ex.changeByObj(ex);
		
		System.out.println(+ex.data);
		
	}

}
