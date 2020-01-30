
public class Concat {
	String concatWithString() {
		String t = "Cat";
		for(int i = 0;i<1000;i++) {
			t = t.concat("Dog");
		}
		
		return t;
	}
	String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Cat");
		for(int i = 0;i<1000;i++) {
			sb.append("Dog");
			
		}
		
		return sb.toString();
	}
	String concatWithStringBuilder() {
		StringBuilder sb = new StringBuilder("Bangladehs");
		for(int i = 0;i<1000;i++) {
			sb.append("Dog");
			
		}
		
		return sb.toString();
	}

}
