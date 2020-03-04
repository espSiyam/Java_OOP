
public class FactoryPatternExample {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getInstancle("car", 4);
		Vehicle bike = VehicleFactory.getInstancle("bike", 2);
		System.out.println(car);
		System.out.println(bike);
		
	}

}