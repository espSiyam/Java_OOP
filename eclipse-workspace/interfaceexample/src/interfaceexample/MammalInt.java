package interfaceexample;

public class MammalInt implements Animal {
	MammalInt(){
		//x = 67;
	}
	public int noOfLegs() {
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MammalInt m  = new MammalInt();
		m.eat();
		m.travel();
		System.out.println(m.noOfLegs());
		System.out.println(Animal.x);
	}
	
	public void eat() {
		System.out.println("Mammal eats");
	}
	
	public void travel() {
			System.out.println("Mammal Travels");
		}

}
