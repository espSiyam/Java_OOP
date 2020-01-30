
public class MethodEx {
	
	int x,y;
	double d;
	String s;
	
	int dispSum (int x,int y) {
		return x+y;
	}
	
	void setX(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx me = new MethodEx();
		int a=me.dispSum(6,5);
		System.out.println(+a);
		
		me.setX(10);
		System.out.println(+me.x);
	}

}
