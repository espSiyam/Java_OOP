
public class EqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Yes");
		
		String s2 = new String("Yes");
		
		if(s1 == s2) {
			System.out.println("== operator checks object reference");
		}
		else {
			System.out.println(" s1  ans s2 are not same object");
		}
		if(s1.equals(s2)) {
			System.out.println("equals () method checks value");
		}
		else {
			System.out.println(" s1  ans s2 values are not equal");
		}

	}

}
